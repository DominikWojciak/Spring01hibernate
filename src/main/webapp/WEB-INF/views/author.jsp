<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form method="post" modelAttribute="author">
    <label for="firstNameId">First name:</label>
    <form:input type="text" path="firstName" id="firstNameId"/>
    <br><br>

    <label for="lastNameId">Last name:</label>
    <form:input type="text" path="lastName" id="lastNameId"/>

    <label for="peselId">Pesel:</label>
    <form:input type="text" path="pesel" id="peselId"/>

    <label for="emailId">Email:</label>
    <form:input type="text" path="email" id="emailId"/>

    <label for="yearOfBirthId">Year of birth:</label>
    <form:input type="number" path="yearOfBirth" id="yearOfBirthId"/>

    <input type="submit" value="Save">
</form:form>
</body>
</html>