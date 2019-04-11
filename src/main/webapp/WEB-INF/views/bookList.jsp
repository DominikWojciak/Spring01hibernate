<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>Title</th>
        <th>Rating</th>
        <th>Publisher</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.title}</td>
            <td>${book.rating}</td>
            <td>${book.publisher.name}</td>
            <td>
                <a href="/books/update/${book.id}">Edit</a>
                <a href="/books/delete/${book.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>