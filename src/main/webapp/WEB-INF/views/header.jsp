<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet"
    href="<c:url value="resources/css/bootstrap.min.css" />" />
<script src="<c:url value="resources/js/bootstrap.min.js" />"></script>
<link rel="stylesheet"	href="<c:url value="resources/css/bootstrap.min.css" />" />
<script src="<c:url value="resources/js/jquery-2.2.4.js" />"></script>
<script src="<c:url value="resources/js/bootstrap.min.js" />"></script>
<nav class="navbar navbar-inverse" style="background-color:aqua"><br>
<nav class="navbar navbar-inverse" style="background-color:red"><br>


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
</head>
<body>
<h1 style="color:red;"><center>E- TORO</center></h1><hr>



