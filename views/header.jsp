

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %> 




<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<title>PavanMotors</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
 <a class="navbar-brand" href="#">PAVAN MOTORS</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="Tvscaursol">Home</a></li>
     <li><a href="viewproducts"> Product</a></li>
      <!-- <li><a href="Admin">Cart</a></li> -->
 
     </ul>
    <ul class="nav navbar-nav navbar-right">
<!--       <li><a href="RegisterPage"><span class="glyphicon glyphicon-user"></span> SignUp</a></li>
        <li><a href="log"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>   -->
      <c:choose>
					<c:when test="${LoggedIn}">

						<li style="float: right"><a href="perform_logout"
							class="w3-hover-none"><i class="fa fa-sign-out"></i>Logout</a></li>


						<li style="float: right"><a href="#" class="w3-hover-none"><i
								class="fa fa-user"></i> Hi, ${username}</a></li>
					</c:when>
					<c:otherwise>
						<li style="float: right"><a href="register">Sign up</a></li>
						<li style="float: right"><a href="login1">Login</a></li>
					</c:otherwise>
					</c:choose>
    </ul>
  </div>
</nav>





<%-- 

 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html>

<head>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>
 
<body>
<center><h1 style="background-color:black;color:white";>WELCOME TO PAVAN MOTORS </h1> </center>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="contact">PAVAN MOTORS.COM</a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="Tvscaursol">Home</a></li>
      
        <li><a href="contact">Contactus</a></li>
        <li><a href="aboutus">Aboutus</a></li>
        

        
          <li>
        </ul>
      </li>
   
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
				<li style="float: right"><a href="register">Sign up</a></li>
				<li style="float: right"><a href="login1">Login</a></li>
			</c:otherwise>
		</c:choose>





    </ul>
  </div>
</nav>





 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gaming</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
<br>
<nav class="navbar navbar-inverse">
<div class="container-fluid">
	<div class="navbar-header">
		<a class="navbar-brand" href="#"><b>Professional</b></a>
	</div>
	<ul class="nav navbar-nav">
		<li><a href="viewproduct"><b>viewproduct</b> </a></li>
		<li><a href="#"><b></b></a></li>
		<li><a href="#"><b></b></a></li>

	</ul>
	<ul class="nav navbar-nav navbar-right">

		<!-- <!--  <li><a href="Cart"><span class="glyphicon glyphicon-shopping-cart"></span><b>Cart</b></a></li>
      <li><a href="UserRegistration"><span class="glyphicon glyphicon-user"></span><b>SignUp</b></a></li>
      <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> <b>Login</b></a></li> -->

		<c:choose>
			<c:when test="${LoggedIn}">

				<li style="float: right"><a href="perform_logout"
					class="w3-hover-none"><i class="fa fa-sign-out"></i>Logout</a></li>


				<li style="float: right"><a href="#" class="w3-hover-none"><i
						class="fa fa-user"></i> Hi, ${username}</a></li>
			</c:when>
			<c:otherwise>
				<li style="float: right"><a href="register">Sign up</a></li>
				<li style="float: right"><a href="login1">Login</a></li>
			</c:otherwise>
		</c:choose>




	</ul>
</div>
</nav>
  
  
   --%>
  
  
  
  
  
  
  
  
  
  