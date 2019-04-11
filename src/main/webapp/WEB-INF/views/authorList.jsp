<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1">
    <tr>
        <th>First name</th>
        <th>Last name</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${authors}" var="author">
        <tr>
            <td>${author.firstName}</td>
            <td>${author.lastName}</td>
            <td>
                <a href="/authors/update/${author.id}">Edit</a>
                <a href="/authors/delete/${author.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>