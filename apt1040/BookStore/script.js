// 📚 Load Books from XML using AJAX
function loadBooks() {
    let xhr = new XMLHttpRequest();
    xhr.open("GET", "books.xml", true);
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            let xml = xhr.responseXML;
            parseBooks(xml);
        }
    };
    xhr.send();
}

// 📌 Global Book Array
let allBooks = [];

function parseBooks(xml) {
    let books = xml.getElementsByTagName("book");
    allBooks = [];

    for (let book of books) {
        let id = book.getAttribute("id");
        let title = book.getElementsByTagName("title")[0].textContent;
        let author = book.getElementsByTagName("author")[0].textContent;
        let price = parseFloat(book.getElementsByTagName("price")[0].textContent);
        let genre = book.getElementsByTagName("genre")[0].textContent;
        let preview = book.getElementsByTagName("preview")[0]?.textContent || 
                      `Explore "${title}" to uncover valuable insights on ${genre}. A must-read for enthusiasts and professionals alike.`;

        allBooks.push({ id, title, author, price, genre, preview });
    }

    filterAndSortBooks();
}

// 🎯 Render Books with Clickable Details & Preview Button
function renderBooks(filteredBooks) {
    let bookList = document.getElementById("bookList");
    bookList.innerHTML = "";

    if (filteredBooks.length === 0) {
        bookList.innerHTML = "<p>No books found.</p>";
        return;
    }

    filteredBooks.forEach(book => {
        let bookItem = document.createElement("div");
        bookItem.classList.add("book-item");
        bookItem.innerHTML = `
            <div class="book-details">
                <span class="book-title" onclick="viewBookDetails('${book.id}')">${book.title}</span>
                <span class="book-author">by ${book.author}</span>
                <span class="book-price">$${book.price.toFixed(2)}</span>
            </div>
            <div class="book-buttons">
                <button class="add-to-cart" onclick="addToCart('${book.id}', '${book.title}', ${book.price})">🛒 Add to Cart</button>
                <button class="preview-btn" onclick="previewBook('${book.id}')">👀 Preview</button>
            </div>
        `;
        bookList.appendChild(bookItem);
    });
}

// 🔍 Search Books
document.getElementById("searchInput").addEventListener("keyup", filterAndSortBooks);

// 🎛 Genre Filter & Sorting
document.getElementById("genreFilter").addEventListener("change", filterAndSortBooks);
document.getElementById("sortPrice").addEventListener("change", filterAndSortBooks);

// 📌 Function to Filter & Sort Books
function filterAndSortBooks() {
    let searchQuery = document.getElementById("searchInput").value.toLowerCase();
    let selectedGenre = document.getElementById("genreFilter").value;
    let sortBy = document.getElementById("sortPrice").value;

    let filteredBooks = allBooks.filter(book => 
        (selectedGenre === "All" || book.genre === selectedGenre) &&
        (book.title.toLowerCase().includes(searchQuery) || book.author.toLowerCase().includes(searchQuery))
    );

    if (sortBy === "asc") {
        filteredBooks.sort((a, b) => a.price - b.price);
    } else if (sortBy === "desc") {
        filteredBooks.sort((a, b) => b.price - a.price);
    }

    renderBooks(filteredBooks);
}

// 📖 View Book Details (Metadata Modal)
function viewBookDetails(bookId) {
    let book = allBooks.find(b => b.id === bookId);
    if (!book) return;

    let modalContent = `
        <h3>${book.title}</h3>
        <p><strong>Author:</strong> ${book.author}</p>
        <p><strong>Price:</strong> $${book.price.toFixed(2)}</p>
        <p><strong>Genre:</strong> ${book.genre}</p>
        <button onclick="closeModal()">Close</button>
    `;

    let modal = document.getElementById("modal");
    modal.innerHTML = modalContent;
    modal.style.display = "block";
}

// 👀 Preview Book (20+ Word Summary)
function previewBook(bookId) {
    let book = allBooks.find(b => b.id === bookId);
    if (!book) return;

    let modalContent = `
        <h3>📘 Preview: ${book.title}</h3>
        <p>${book.preview}</p>
        <button onclick="closeModal()">Close</button>
    `;

    let modal = document.getElementById("modal");
    modal.innerHTML = modalContent;
    modal.style.display = "block";
}

// 🛒 Shopping Cart Logic
let cart = JSON.parse(localStorage.getItem("cart")) || [];

function addToCart(id, title, price) {
    let existingItem = cart.find(item => item.id === id);
    if (existingItem) {
        existingItem.quantity++;
    } else {
        cart.push({ id, title, price, quantity: 1 });
    }

    localStorage.setItem("cart", JSON.stringify(cart));
    displayCart();
}

// 🛍 Display Cart
function displayCart() {
    let cartList = document.getElementById("cartList");
    let cartTotal = document.getElementById("cartTotal");
    cartList.innerHTML = "";

    let total = 0;
    cart.forEach((item, index) => {
        total += item.price * item.quantity;
        let li = document.createElement("li");
        li.innerHTML = `
            ${item.title} - $${item.price.toFixed(2)} x ${item.quantity}
            <button onclick="removeFromCart(${index})">❌</button>
        `;
        cartList.appendChild(li);
    });

    cartTotal.innerText = `Total: $${total.toFixed(2)}`;
}

// ❌ Remove from Cart
function removeFromCart(index) {
    if (cart[index].quantity > 1) {
        cart[index].quantity--;
    } else {
        cart.splice(index, 1);
    }

    localStorage.setItem("cart", JSON.stringify(cart));
    displayCart();
}

// 🗑 Clear Cart
function clearCart() {
    if (cart.length === 0) return alert("🛑 Your cart is already empty!");
    if (confirm("🗑 Are you sure you want to clear your cart?")) {
        cart = [];
        localStorage.removeItem("cart");
        displayCart();
    }
}

// 💳 Checkout
function checkout() {
    if (cart.length === 0) return alert("🛒 Your cart is empty!");
    alert("✅ Thank you for your purchase!");
    clearCart();
}

// 🔥 Load Books & Cart on Page Load
window.onload = function () {
    loadBooks();
    displayCart();
};

// ❌ Close Modal
function closeModal() {
    document.getElementById("modal").style.display = "none";
}
