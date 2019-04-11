<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="student">
    <label for="firstNameId">First name:</label>
    <form:input type="text" path="firstName" id="firstNameId"/><br/><br/>

    <label for="lastNameId">Last name:</label>
    <form:input type="text" path="lastName" id="lastNameId"/><br/><br/>

    <label for="maleId">Male:</label>
    <form:radiobutton path="gender" value="M" id="maleId"/>
    <label for="femaleId">Female:</label>
    <form:radiobutton path="gender" value="F" id="femaleId"/><br/><br/>

    <label for="countryId">Country:</label>
    <form:select path="country" items="${countries}" id="countryId"/><br/><br/>

    <label for="notesId">Notes:</label>
    <form:textarea path="notes" rows="3" cols="20" id="notesId"/><br/><br/>

    <label for="mailingListId">Mailing list:</label>
    <form:checkbox path="mailingList" id="mailingListId"/><br/><br/>

    <label for="skillId">Skills:</label>
    <form:select path="programmingSkills" items="${skills}" id="skillId"/><br/><br/>

    <label for="hobbiesId">Hobbies:</label>
    <form:checkboxes items="${hobbies}" path="hobbies" id="hobbiesId"/><br/><br/>

    <input type="submit" value="Save">
</form:form>
</body>
</html>