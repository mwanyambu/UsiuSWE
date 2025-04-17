// Contact Form Validation
const contactForm = document.getElementById('contact-form');

if (contactForm) {
    contactForm.addEventListener('submit', function(e) {
        e.preventDefault();
        
        // Form fields
        const nameInput = document.getElementById('name');
        const emailInput = document.getElementById('contact-email');
        const subjectInput = document.getElementById('subject');
        const messageInput = document.getElementById('message');
        
        // Error elements
        const nameError = document.getElementById('name-error');
        const emailError = document.getElementById('contact-email-error');
        const subjectError = document.getElementById('subject-error');
        const messageError = document.getElementById('message-error');
        
        // Form values
        const name = nameInput.value.trim();
        const email = emailInput.value.trim();
        const subject = subjectInput.value.trim();
        const message = messageInput.value.trim();
        
        // Clear previous errors
        nameError.textContent = '';
        emailError.textContent = '';
        subjectError.textContent = '';
        messageError.textContent = '';
        
        // Validation flag
        let isValid = true;
        
        // Validate name
        if (name === '') {
            nameError.textContent = 'Name is required';
            isValid = false;
        }
        
        // Validate email
        if (email === '') {
            emailError.textContent = 'Email is required';
            isValid = false;
        } else if (!isValidEmail(email)) {
            emailError.textContent = 'Please enter a valid email address';
            isValid = false;
        }
        
        // Validate subject
        if (subject === '') {
            subjectError.textContent = 'Subject is required';
            isValid = false;
        }
        
        // Validate message
        if (message === '') {
            messageError.textContent = 'Message is required';
            isValid = false;
        } else if (message.length < 20) {
            messageError.textContent = 'Message must be at least 20 characters';
            isValid = false;
        }
        
        // If all validations pass
        if (isValid) {
            const successMessage = document.getElementById('form-success');
            successMessage.style.display = 'block';
            contactForm.reset();
            
            // Hide success message after 5 seconds
            setTimeout(() => {
                successMessage.style.display = 'none';
            }, 5000);
            
            // In a real application, you would submit the form data to a server here
        }
    });
    
    // Real-time validation for better user experience
    const formInputs = contactForm.querySelectorAll('input, textarea');
    formInputs.forEach(input => {
        input.addEventListener('blur', function() {
            validateInput(this);
        });
        
        input.addEventListener('input', function() {
            const errorElement = document.getElementById(`${this.id}-error`);
            if (errorElement.textContent !== '') {
                validateInput(this);
            }
        });
    });
    
    // Function to validate individual input
    function validateInput(input) {
        const errorElement = document.getElementById(`${input.id}-error`);
        const value = input.value.trim();
        
        // Clear previous error
        errorElement.textContent = '';
        
        // Validate based on input id
        switch (input.id) {
            case 'name':
                if (value === '') {
                    errorElement.textContent = 'Name is required';
                }
                break;
                
            case 'contact-email':
                if (value === '') {
                    errorElement.textContent = 'Email is required';
                } else if (!isValidEmail(value)) {
                    errorElement.textContent = 'Please enter a valid email address';
                }
                break;
                
            case 'subject':
                if (value === '') {
                    errorElement.textContent = 'Subject is required';
                }
                break;
                
            case 'message':
                if (value === '') {
                    errorElement.textContent = 'Message is required';
                } else if (value.length < 20) {
                    errorElement.textContent = 'Message must be at least 20 characters';
                }
                break;
        }
    }
}

// Email validation function
function isValidEmail(email) {
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailRegex.test(email);
}