
<%@include file="header.jsp"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<script type="text/javascript"
	src="https://gc.kis.scr.kaspersky-labs.com/F735D753-CB57-2144-9288-48F787DAC4FC/main.js"
	charset="UTF-8"></script>
</head>
<style>
body

 {
    background-image:url(resources/images/logo/r3.jpg);
    background-repeat:no-repeat;
    background-size:cover;
    
}
</style>
	<HR>
	<CENTER>
		<CENTER>



			<br> 
			<form action="<c:url value="j_spring_security_check" />"
				method="post">

				<table>
					<center>
						<h2>
							<font color="green"><u>Enter your credentials below </u></font>
						</h2>
						<br>



						<tr>
							<td style="color: black">USERNAME:</td>
							<td><input type="text" name="j_username" /></td>
						</tr>
						<br> <br> <br>
						<tr>
							<td style="color: black">PASSWORD:</td>
							<td><input type="password" name="j_password" /></td>
						</tr>
						<tr>
							<td><input type="submit" value="Login" /></td>
							<td><input type="reset" value="Reset" /></td>
						</tr>
				</table>
			</form>
		</CENTER>


		<br> <br>
		<br> <br> <br> <br><br> <br>
		<br> <br> <br> <br>
		<%@include file="footer.jsp"%>