
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Student Profile Result</title>

    <link rel="stylesheet" href="css/style.css">
</head>

<body>

    <div class="container">

        <div class="header">
            <h1>Profile Submitted!</h1>
            <p>Your personal profile has been successfully created.</p>
        </div>

        <div class="profile-result">

            <h2>Student Profile</h2>

            <div class="profile-item">
                <label>Full Name</label>
                <p>${name}</p>
            </div>

            <div class="profile-item">
                <label>Student ID</label>
                <p>${studentId}</p>
            </div>

            <div class="profile-item">
                <label>Program</label>
                <p>${program}</p>
            </div>

            <div class="profile-item">
                <label>Email Address</label>
                <p>${email}</p>
            </div>

            <div class="profile-item">
                <label>Hobbies</label>
                <p>${hobbiesText}</p>
            </div>

            <div class="profile-item">
                <label>Short Self-Introduction</label>
                <p class="introduction">${introduction}</p>
            </div>

            <a href="index.html" class="back-button">
                Back to Profile Form
            </a>

        </div>

        <div class="footer">
            <p>Personal Profile Web Application</p>
        </div>

    </div>

</body>
</html>
