<%@ include file="header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<style>
* {
	padding: 0;
	margin: 0;
}

body {
	font-family: sans-serif;
	background-image: url(< c : url value = "/resources/images/pic3.jpg"/ >);
}

a {
	text-decoration: none;
	color: #00A5CC;
}

li {
	list-style-type: none;
}

nav {
	width: 100%;
	text-align: center;
}

nav a {
	display: block;
	padding: 15px 0;
	border-bottom: 1px solid #C3AA6E;
}

nav a:hover {
	background: #E5DAC0;
	color: #FFF;
}

nav li:last-child a {
	border-bottom: none;
}

.menu {
	width: 240px;
	height: 100%;
	position: absolute;
	background: #D9C9A3;
}

.menu-icon {
	padding: 10px 20px;
	background: #E5DAC0;
	color: #98703E;
	cursor: pointer;
	float: right;
}

</style>
</head>
<body>
	<nav class="menu">
		<ul>

			<li><a href="chat">Chat</a></li>
			<li><a href="newblog">Blog</a></li>
			<li><a href="newforum">Forum</a></li>
			<li><a href="login">Login Here</a></li>
			<li><a href="SignUp">SignUp</a></li>
			<li><a href="UserProfile">Upload your Profile picture Here</a></li>
			</ul>
	</nav>
	
