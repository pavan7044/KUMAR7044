
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGOUT</title>
<style>
body
{
background-color:#1A5276;
}
</style>

</head>
<body>
<%
session.invalidate();
%>
<br><br>
<center><h1>YOU HAVE SUCCESFULLY LOGGED OUT</h1></center>

</body>
</html>