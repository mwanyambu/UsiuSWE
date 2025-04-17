// Theme toggle functionality
document.addEventListener('DOMContentLoaded', function() {
    // Set theme based on localStorage or default to light
    const savedTheme = localStorage.getItem('theme') || 'light';
    document.body.setAttribute('data-theme', savedTheme);
    updateThemeIcon(savedTheme);
    
    // Theme toggle button functionality
    const themeToggle = document.getElementById('theme-toggle');
    themeToggle.addEventListener('click', function() {
        const currentTheme = document.body.getAttribute('data-theme');
        const newTheme = currentTheme === 'light' ? 'dark' : 'light';
        
        document.body.setAttribute('data-theme', newTheme);
        localStorage.setItem('theme', newTheme);
        
        updateThemeIcon(newTheme);
    });
    
    // Mobile menu toggle
    const menuToggle = document.querySelector('.menu-toggle');
    const navLinks = document.querySelector('.nav-links');
    
    if (menuToggle) {
        menuToggle.addEventListener('click', function() {
            navLinks.classList.toggle('show');
        });
    }
    
    // Load featured courses on homepage
    if (document.getElementById('featured-courses')) {
        loadCoursesFromXML('featured');
    }
});

function updateThemeIcon(theme) {
    const themeToggle = document.getElementById('theme-toggle');
    const icon = themeToggle.querySelector('i');
    
    if (theme === 'dark') {
        icon.className = 'fas fa-sun';
        themeToggle.setAttribute('aria-label', 'Switch to light mode');
    } else {
        icon.className = 'fas fa-moon';
        themeToggle.setAttribute('aria-label', 'Switch to dark mode');
    }
}

// Newsletter form validation
const newsletterForm = document.getElementById('newsletter-form');
if (newsletterForm) {
    newsletterForm.addEventListener('submit', function(e) {
        e.preventDefault();
        
        const emailInput = document.getElementById('email');
        const emailError = document.getElementById('email-error');
        
        if (!validateEmail(emailInput.value)) {
            emailError.textContent = 'Please enter a valid email address';
            emailInput.focus();
            return;
        }
        
        emailError.textContent = '';
        
        // Simulating form submission
        emailError.textContent = 'Thank you for subscribing!';
        emailError.style.color = 'var(--success-color)';
        newsletterForm.reset();
        
        // Reset success message after 3 seconds
        setTimeout(() => {
            emailError.textContent = '';
            emailError.style.color = 'var(--error-color)';
        }, 3000);
    });
}

// Email validation helper function
function validateEmail(email) {
    const re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(email.toLowerCase());
}

// Function to load courses from XML file
function loadCoursesFromXML(type) {
    const xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (this.readyState === 4 && this.status === 200) {
            displayCourses(this, type);
        }
    };
    xhr.open('GET', 'courses.xml', true);
    xhr.send();
}

// Function to display courses from XML data
function displayCourses(xml, type) {
    const xmlDoc = xml.responseXML;
    const courses = xmlDoc.getElementsByTagName('course');
    let output = '';
    
    // Clear loading indicator
    let container;
    if (type === 'featured') {
        container = document.getElementById('featured-courses');
        container.innerHTML = '';
        
        // Display only featured courses (max 3)
        let featuredCount = 0;
        for (let i = 0; i < courses.length && featuredCount < 3; i++) {
            const isFeatured = courses[i].getElementsByTagName('featured')[0].textContent === 'true';
            if (isFeatured) {
                output += createCourseCard(courses[i]);
                featuredCount++;
            }
        }
    } else {
        container = document.getElementById('course-list');
        container.innerHTML = '';
        
        // Display all courses
        for (let i = 0; i < courses.length; i++) {
            output += createCourseCard(courses[i]);
        }
    }
    
    container.innerHTML = output;
    
    // Add event listeners to course cards
    const courseCards = container.querySelectorAll('.course-card');
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
        <div class="course-card" data-id="${id}">
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

// Function to display course preview
function showCoursePreview(courseId, xml) {
    const xmlDoc = xml.responseXML;
    const courses = xmlDoc.getElementsByTagName('course');
    let selectedCourse = null;
    
    // Find the course with matching ID
    for (let i = 0; i < courses.length; i++) {
        if (courses[i].getAttribute('id') === courseId) {
            selectedCourse = courses[i];
            break;
        }
    }
    
    if (selectedCourse) {
        const title = selectedCourse.getElementsByTagName('title')[0].textContent;
        const fullDescription = selectedCourse.getElementsByTagName('full_description')[0].textContent;
        const image = selectedCourse.getElementsByTagName('image')[0].textContent;
        const category = selectedCourse.getElementsByTagName('category')[0].textContent;
        const duration = selectedCourse.getElementsByTagName('duration')[0].textContent;
        const rating = selectedCourse.getElementsByTagName('rating')[0].textContent;
        const instructor = selectedCourse.getElementsByTagName('instructor')[0].textContent;
        
        // Create modules list
        const modules = selectedCourse.getElementsByTagName('module');
        let modulesList = '';
        
        for (let i = 0; i < modules.length; i++) {
            const moduleTitle = modules[i].getElementsByTagName('title')[0].textContent;
            const moduleDuration = modules[i].getElementsByTagName('duration')[0].textContent;
            
            modulesList += `
                <li>
                    <span class="module-title">${moduleTitle}</span>
                    <span class="module-duration">${moduleDuration}</span>
                </li>
            `;
        }
        
        const previewContent = `
            <div class="preview-header">
                <h3>${title}</h3>
                <span class="preview-category">${category}</span>
            </div>
            <div class="preview-image">
                <img src="${image}" alt="${title}">
            </div>
            <div class="preview-details">
                <div class="preview-meta">
                    <div class="preview-item">
                        <i class="fas fa-user"></i>
                        <span>Instructor: ${instructor}</span>
                    </div>
                    <div class="preview-item">
                        <i class="fas fa-clock"></i>
                        <span>${duration}</span>
                    </div>
                    <div class="preview-item">
                        <i class="fas fa-star"></i>
                        <span>Rating: ${rating}</span>
                    </div>
                </div>
                <div class="preview-description">
                    <h4>About This Course</h4>
                    <p>${fullDescription}</p>
                </div>
                <div class="preview-modules">
                    <h4>Course Content</h4>
                    <ul class="modules-list">
                        ${modulesList}
                    </ul>
                </div>
                <a href="#" class="btn btn-primary">Enroll Now</a>
            </div>
        `;
        
        document.getElementById('preview-details').innerHTML = previewContent;
        document.getElementById('course-preview').classList.add('show');
        
        // Close preview functionality
        const closePreview = document.querySelector('.close-preview');
        closePreview.addEventListener('click', function() {
            document.getElementById('course-preview').classList.remove('show');
        });
    }
}