<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form method="post" modelAttribute="book">

    <div>
        <label>Title:
            <form:input path="title"/>
            <form:errors path="title" element="div"/>
        </label>
    </div>
    <div>
        <label>Rating:
            <form:input type="number" path="rating" min="1" max="10"/>
            <form:errors path="rating" element="div"/>
        </label>
    </div>
    <div>
        <label>Description:
            <form:textarea path="description" cols="60" rows="3"/>
            <form:errors path="description" element="div"/>
        </label>
    </div>
    <div>
        <label>Pages:
            <form:input type="number" path="pages"/>
            <form:errors path="pages" element="div"/>
        </label>
    </div>
    <div>
        <label>Publisher:
            <form:select path="publisher.id" items="${publishers}" itemLabel="name" itemValue="id"/>
            <form:errors path="publisher.id" element="div"/>
        </label>
    </div>

    <div>
        <label>Authors:
            <form:select path="authors" items="${authors}" itemLabel="fullName" itemValue="id"/>
            <form:errors path="authors" element="div"/>
        </label>
    </div>


    <input type="submit" value="Save">

</form:form>

</body>
</html>