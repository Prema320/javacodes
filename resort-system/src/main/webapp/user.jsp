<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Result</title>
</head>
<h1>${updateMessage}</h1>
<body>

<table border=1>
<tr>
<th>id</th>
<th>name</th>
<th>email</th>
<th>mobileNo</th>
<th>comments</th>
<th>Action</th>

</tr>
<c:forEach items="${users}" var="user">
<tr>
<td>${user.getId()}</td>
<td>${user.getName()}</td>
<td>${user.getEmail()}</td>
<td>${user.getMobileNo()}</td>
<td>${user.getComments()}</td>


<td><a href="update?userId=${user.getId()}">Update</a>
&nbsp; &nbsp; &nbsp;
<a href="delete?userId=${user.getId()}">Delete</a></td>
</tr>

</c:forEach>
</table>

</body>
</html>