<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
  <title>Sign UP</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
  .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
      min-height:200px;
  }

  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
      display: none;
    }
  }
  </style>
 </center>
 <style>
 html
 {
 width:100%;
 height:100%;
 background:url('Images/logo/gif.gif')center center no-repeat;
 }</style>
</head>
<body>
<center>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="home">PAVAN MOTORS</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="home">Home</a></li>
    
        
        <li><a href="Contact">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="login1"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>


<table>
<form method="get" action="login">

<tr><td>
first name</td><td><input type="next" name="t1" placeholder="enter name in caps" reuired/></td></tr><tr><td><br>
<tr><td>password</td><td><input type="password" name="t2" required/></td></tr><br>
<tr><td>address</td><td> <textarea rows="5" cols="10" placeholder="address here"name="t3" required></textarea></td></tr><tr><br>
<td>phone number</td><td><input type="number" required></td></tr><tr><td><br>
<tr><td>email id</td><td><input type="email" name="t5" required></td></tr><br>
<tr><td>date of birth</td><td><input type="date" name="d1" required></td></tr><tr><br>
<tr><td>male<input type="radio" name="r1" required></td><br>
<td><input type="radio" name="r1" >female</td></tr><br>

<tr><td><a href="login1">
<input type="submit" value="submit"/></a></td><td>
<input type="reset" value="reset"/></td></tr>

</form>
</table></center>

</body>
</html>