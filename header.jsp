
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>





<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

<title>E - TORO </title>
</head>
<body>
<nav class="navbar navbar-inverse" style="background-color:aqua">



  <div class="container-fluid">
    <div class="navbar-header">
 <a class="navbar-brand" href="index" style="color:red;font-family:MV Boli";>E - TORO </a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="index">Home</a></li>
            <li><a href="contactus">Contactus</a></li>
            <li><a href="About">About</a></li>
     
     <li><a href="blog" style="float:center";>Blog</a></li>
     <li><a href="fom" style="float:center";>forum</a></li>
     <li><a href="getchat" style="float:center";>Chat</a></li>
     
 
     </ul>
    <ul class="nav navbar-nav navbar-right">

      <c:choose>
					<c:when test="${LoggedIn}">

						<li style="float: right"><a href="perform_logout"
							class="w3-hover-none"><i class="fa fa-sign-out"></i>Logout</a></li>


						<li style="float: right"><a href="#" class="w3-hover-none"><i
								class="fa fa-user"></i> Hi, ${username}</a></li>
					</c:when>
					<c:otherwise>
						<li style="float: right"><a href="SignUp">Sign up</a></li>
						<li style="float: right"><a href="login">Login</a></li> 
					</c:otherwise>
					</c:choose>
    </ul>
  </div>
</nav>

<marquee behavior="alternate">


<h2 style="color:#900C3F;font-family:MV Boli";>Mahesh  P@V@N  Chandu</h2></marquee>



 
 
 
 
