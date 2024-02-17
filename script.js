document.addEventListener('DOMContentLoaded', function() {
    // Your JavaScript code here
    const element = document.getElementById('someElementId');
    if (element) {
        element.addEventListener('click', function() {
            // Do something when the element is clicked
        });
    } else {
        console.error('Element with id "someElementId" not found');
    }

    // Example of using fetch to make a request
    fetch('http://localhost:3306/api/marks')
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(data => {
            // Process the retrieved data
        })
        .catch(error => {
            console.error('Error fetching data:', error);
        });
});

// Student Screen
document.getElementById('addStudentBtn').addEventListener('click', function() {
    // Add logic to handle adding a student
});

document.getElementById('viewStudentBtn').addEventListener('click', function() {
    // Add logic to handle viewing students
});

document.getElementById('editStudentBtn').addEventListener('click', function() {
    // Add logic to handle editing a student
});

document.getElementById('deleteStudentBtn').addEventListener('click', function() {
    // Add logic to handle deleting a student
});

// Teacher Screen
document.getElementById('addTeacherBtn').addEventListener('click', function() {
    // Add logic to handle adding a teacher
});

document.getElementById('viewTeacherBtn').addEventListener('click', function() {
    // Add logic to handle viewing teachers
});

document.getElementById('editTeacherBtn').addEventListener('click', function() {
    // Add logic to handle editing a teacher
});

document.getElementById('deleteTeacherBtn').addEventListener('click', function() {
    // Add logic to handle deleting a teacher
});

// Marks Screen
document.getElementById('searchMarksBtn').addEventListener('click', function() {
    // Add logic to handle searching marks for selected students
    const selectedStudents = Array.from(document.getElementById('studentSelect').selectedOptions).map(option => option.value);
    // Make AJAX request to fetch marks for selected students
    // Display marks details in the marksDetails div
});
