<%@ page language="java" contentType="text/html" pageEncoding="ISO-8859-1" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
 <h1> ${user} </h1>
<body>
<form action="updateUser" method="post">

    <h2 style="display:none"><input type="text" name="id" value="${userInfo.getId()}" style="display:none"></h2>
 Name:<input type="text" name="name" value="${userInfo.getName()}"><br>
 Email:<input type="text" name="email" value="${userInfo.getEmail()}"><br>
 MobileNo:<input type="text" name="mobileNo" value="${userInfo.getMobileNo()}"><br>
 Comments:<input type="text" name="comments" value="${userInfo.getComments()}"><br>
<br>
<input type="submit" value="update">
</form>
</body>
</html>