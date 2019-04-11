<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form method="post" modelAttribute="person">

    <label>Login:
        <from:input type="text" path="login"/>
    </label>

    <br><br>

    <label>Password:
        <form:password path="password"/>
    </label>

    <br><br>

    <label>Email:
        <form:input type="email" path="email"/>
    </label>

    <br><br>

    <input type="submit" value="Save"/>

</form:form>

</body>
</html>