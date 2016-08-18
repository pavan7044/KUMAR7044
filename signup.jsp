<%@includefile ="header.jsp"%>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<style>
body

 {
    background-image:url(resources/images/logo/logozz.jpg);
    background-repeat:no-repeat;
    background-size:cover;
    
}
</style>

<table>
<form method="get" action="register">

<tr><td>
<h3 style="font-weight:bold";>First Name</h3></td><td>
<input type="next" name="firstname" placeholder="enter name in caps" reuired/></td></tr>
<tr><td>
<h3 style="font-weight:bold";>Last Name</h3></td><td>
<input type="next" name="lastname" placeholder="enter name in caps" /></td></tr>
<tr><td>
<h3 style="font-weight:bold";>User Name</h3></td><td>
<input type="next" name="username" placeholder="enter name in caps" reuired/></td></tr><tr><td><br>
<tr><td><h3 style="font-weight:bold"; >Password</h3></td><td>
<input type="password" name="password" required/></td></tr><br>
<tr><br>
<td><h3 style="font-weight:bold";>Mobile No</h3></td>
<td><input type="text" path="phoneno" required></td></tr><tr><td><br>
<tr><td><h3 style="font-weight:bold";>E-mail Id</h3></td>
<td><input type="email" name="email" required></td></tr><br>
<br>
<tr><td><h3 style="font-weight:bold";>Male</h3><input type="radio" name="r1" required></td>
<td><h3 style="font-weight:bold";>Female</h3><input type="radio" name="r1" ><br></td></tr><br><br>

<tr><td>
<input type="submit" value="submit"/></td><td>
<input type="reset" value="reset"/></td></tr>

</form>
</table>
<%@includefile ="footer.jsp"%>