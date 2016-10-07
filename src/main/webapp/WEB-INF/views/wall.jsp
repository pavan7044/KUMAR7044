<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h3>User Details </h3>
<table>
<tr>
<th>
Id:</th><th>Name:</th><th>Profile Picture</th><th>Email Id</th><th>Location</th></tr>
<tr>
<td>${data.user_id}</td><td> ${data.user_name}</td>
<td><img src="/colloboration/resources/images/${data.user_id}.jpg" style="width: 200px;height:100px"></img>
</td><td>${data.email }</td><td>${data.location }</td></tr>
</table>
</center>
</body>
</html>