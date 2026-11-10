
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thank You - Murach Survey</title>
    <link rel="stylesheet" href="styles/main.css">
</head>
<body>

<div class="survey-container result-container">

    <div class="result-header">
        <h1>Thank You!</h1>
        <p>Thanks for joining our email list.</p>
        <p>Here is the information that you entered:</p>
    </div>

    <fieldset>
        <legend>User Information</legend>

        <div class="result-row">
            <label>First Name</label>
            <span>${user.firstName}</span>
        </div>

        <div class="result-row">
            <label>Last Name</label>
            <span>${user.lastName}</span>
        </div>

        <div class="result-row">
            <label>Email</label>
            <span>${user.email}</span>
        </div>

        <div class="result-row">
            <label>Date of Birth</label>
            <span>${user.dateOfBirth}</span>
        </div>
    </fieldset>

    <fieldset>
        <legend>User Survey</legend>

        <div class="result-row">
            <label>Heard about us</label>
            <span>${survey.source}</span>
        </div>

        <div class="result-row">
            <label>Announcements</label>
            <span>${survey.announcements}</span>
        </div>

        <div class="result-row">
            <label>Special Offers</label>
            <span>${survey.offers}</span>
        </div>

        <div class="result-row">
            <label>Contact Method</label>
            <span>${survey.contactMethod}</span>
        </div>
    </fieldset>

    <p class="return-text">
        To enter another email address, click the button below.
    </p>

    <div class="form-actions">
        <a href="index.html" class="return-button">Return to Survey</a>
    </div>

</div>

</body>
</html>
