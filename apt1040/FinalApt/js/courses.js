document.addEventListener('DOMContentLoaded', function() {
    // Load all courses when courses page loads
    loadAllCourses();
    
    // Search functionality
    const searchButton = document.getElementById('search-btn');
    const searchInput = document.getElementById('course-search');
    
    if (searchButton && searchInput) {
        searchButton.addEventListener('click', function() {
            filterCourses();
        });
        
        searchInput.addEventListener('keyup', function(e) {
            if (e.key === 'Enter') {
                filterCourses();
            }
        });
    }
    
    // Category filter functionality
    const categoryFilter = document.getElementById('category-filter');
    if (categoryFilter) {
        categoryFilter.addEventListener('change', function() {
            filterCourses();
        });
    }
});

// Function to load all courses
function loadAllCourses() {
    const xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (this.readyState === 4 && this.status === 200) {
            displayAllCourses(this);
            // Store XML response for filtering
            window.coursesXML = this;
        }
    };
    xhr.open('GET', 'courses.xml', true);
    xhr.send();
}

// Function to display all courses
function displayAllCourses(xml) {
    const xmlDoc = xml.responseXML;
    const courses = xmlDoc.getElementsByTagName('course');
    const courseList = document.getElementById('course-list');
    
    // Clear loading indicator
    courseList.innerHTML = '';
    
    let output = '';
    for (let i = 0; i < courses.length; i++) {
        output += createCourseCard(courses[i]);
    }
    
    courseList.innerHTML = output;
    
    // Add event listeners to course cards
    const courseCards = document.querySelectorAll('.course-card');
    courseCards.forEach(card => {
        card.addEventListener('click', function() {
            const courseId = this.getAttribute('data-id');
            showCoursePreview(courseId, xml);
        });
    });
}

// Function to create course card HTML
function createCourseCard(course) {
    const id = course.getAttribute('id');
    const title = course.getElementsByTagName('title')[0].textContent;
    const description = course.getElementsByTagName('description')[0].textContent;
    const image = course.getElementsByTagName('image')[0].textContent;
    const category = course.getElementsByTagName('category')[0].textContent;
    const duration = course.getElementsByTagName('duration')[0].textContent;
    const rating = course.getElementsByTagName('rating')[0].textContent;
    
    return `
        <div class="course-card" data-id="${id}" data-category="${category.toLowerCase()}">
            <div class="course-image">
                <img src="${image}" alt="${title}">
            </div>
            <div class="course-content">
                <span class="course-category">${category}</span>
                <h3>${title}</h3>
                <p>${description.substring(0, 100)}...</p>
                <div class="course-info">
                    <div class="course-rating">
                        <i class="fas fa-star"></i>
                        <span>${rating}</span>
                    </div>
                    <div class="course-duration">
                        <i class="fas fa-clock"></i>
                        <span>${duration}</span>
                    </div>
                </div>
            </div>
        </div>
    `;
}

// Function to filter courses
function filterCourses() {
    const searchTerm = document.getElementById('course-search').value.toLowerCase();
    const categoryFilter = document.getElementById('category-filter').value.toLowerCase();
    
    const xml = window.coursesXML;
    if (!xml) return;
    
    const xmlDoc = xml.responseXML;
    const courses = xmlDoc.getElementsByTagName('course');
    const courseList = document.getElementById('course-list');
    const noResults = document.getElementById('no-results');
    
    courseList.innerHTML = '';
    let output = '';
    let resultsFound = false;
    
    for (let i = 0; i < courses.length; i++) {
        const title = courses[i].getElementsByTagName('title')[0].textContent.toLowerCase();
        const description = courses[i].getElementsByTagName('description')[0].textContent.toLowerCase();
        const category = courses[i].getElementsByTagName('category')[0].textContent.toLowerCase();
        
        // Check if course matches search and category filters
        const matchesSearch = searchTerm === '' || title.includes(searchTerm) || description.includes(searchTerm);
        const matchesCategory = categoryFilter === 'all' || category === categoryFilter;
        
        if (matchesSearch && matchesCategory) {
            output += createCourseCard(courses[i]);
            resultsFound = true;
        }
    }
    
    if (resultsFound) {
        courseList.innerHTML = output;
        noResults.style.display = 'none';
        
        // Add event listeners to course cards
        const courseCards = document.querySelectorAll('.course-card');
        courseCards.forEach(card => {
            card.addEventListener('click', function() {
                const courseId = this.getAttribute('data-id');
                showCoursePreview(courseId, xml);
            });
        });
    } else {
        noResults.style.display = 'block';
    }
}