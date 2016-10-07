<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Blog Page</title>
</head>
<body>

<form:form method="POST" commandName="blog" action="bpost">
<table>
    <tr>
    <td>Title :</td></tr>
    <tr><td>
    <form:input path="blog_name" width="50" /></td>
    </tr>
    <tr>
        <td>Content :</td></tr>
        <tr><td><form:textarea path="content" rows="10" cols="150" /></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="Post"></td>
    </tr>
    </table>
    </form:form>
    <%@include file="angularjs.jsp" %>
    </body>
    </html>
    