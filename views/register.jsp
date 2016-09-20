




 <%@include file="header.jsp" %>
<%--  
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
 

<body>
	
	<center> <h1 style="color:white">PAVAN MOTORS</h1></center><hr>
	
	<style>
body

 {
    background-image:url(resources/images/logo/logozz.jpg);
    background-repeat:no-repeat;
    background-size:cover;
    
}
</style>
	

</ul>
</div>
</nav>
	
        <form:form action="signup" method="post" commandName="user" >
            <table border="0">
                
                <tr>
                <tr>
<td>

<select>
    <option value="Mr.">Mr</option>
          <option value="Miss.">Miss</option>
    
    <option value="Mrs.">Mrs</option>
    </select>
    </td>
           </tr><tr>
                 <td><form:label path="ufirstname"> <h2 style="color:black">First Name:</form:label></td>
                  <td><form:input path="ufirstname" /><form:errors path="ufirstname" style="color:darkgreen;font-weight:bold"></form:errors></td>
                </tr>
               
                <tr>
                <td><form:label path="ulastname"><h2 style="color:black">Last Name</form:label></td>
                    <td><form:input path="ulastname" /><form:errors path="ulastname" style="color:darkgreen;font-weight:bold"></form:errors></td>
                </tr><br>
             	<tr>
                    <td><form:label path="username"><h2 style="color:black">User Name</form:label></td>
                   <td><form:input path="username" /><form:errors path="username" style="color:darkgreen;font-weight:bold"></form:errors></td>
                </tr>     
             	
                
                
                
                
<tr>
<td>
 <h2 style="color:black">
Password:
</h2>
</td>
<td><form:password path="upassword"></form:password><form:errors path="upassword" style="color:darkgreen;font-weight:bold"></form:errors>
</td>
                
                
<tr>
<td>
 <h2 style="color:black">
Confirm Password:
</h2></td>
<td><form:password path="uconfirmpassword"></form:password><form:errors path="uconfirmpassword" style="color:darkgreen;font-weight:bold"></form:errors>
</td>
                
                
                
                
                
                
                
                
             
                	<tr>
                     <td><form:label path="uemail"><h2 style="color:black">Email</form:label></td>
                     <td><form:input path="uemail" /><form:errors path="uemail" style="color:darkgreen;font-weight:bold"></form:errors></td>
                </tr> 
                	<tr>
                     <td><form:label path="uphonenumber"><h2 style="color:black">Phone Number</form:label></td>
                     <td><form:input path="uphonenumber" /><form:errors path="uphonenumber" style="color:darkgreen;font-weight:bold"></form:errors></td>
                </tr> 
                 
             	       
       
       				 </table>
       				<tr><td>
                <h5 colspan="0"  ><input type="submit" value="register"></h5>
                 <h5 colspan="0"  ><input type="reset" value="Cancel"></h5>
               
              </td></tr>
             
           
      
           
    </div>
   
      </form:form> --%>
      
      
      
      
      
      
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<body>
	
	<center> <h1 style="color:white">PAVAN MOTORS</h1></center><hr>
	
	<style>
body

 {
    background-image:url(resources/images/logo/logozz.jpg);
    background-repeat:no-repeat;
    background-size:cover;
    
}
</style>
	

</ul>
</div>
</nav>
	
        <form:form action="signup" method="post" commandName="user" >
            <table border="0">
                
                <tr>
                <tr>
<td>

<select>
    <option value="Mr.">Mr</option>
          <option value="Miss.">Miss</option>
    
    <option value="Mrs.">Mrs</option>
    </select>
    </td>
           </tr><tr>
                 <td><form:label path="ufirstname"> <h2 style="color:black">First Name:</form:label></td>
                  <td><form:input path="ufirstname" /><form:errors path="ufirstname" style="color:darkgreen;font-weight:bold"></form:errors></td>
                </tr>
               
                <tr>
                <td><form:label path="ulastname"><h2 style="color:black">Last Name</form:label></td>
                    <td><form:input path="ulastname" /><form:errors path="ulastname" style="color:darkgreen;font-weight:bold"></form:errors></td>
                </tr><br>
             	<tr>
                    <td><form:label path="username"><h2 style="color:black">User Name</form:label></td>
                   <td><form:input path="username" /><form:errors path="username" style="color:darkgreen;font-weight:bold"></form:errors></td>
                </tr>     
             	
                
                
                
                
<tr>
<td>
 <h2 style="color:black">
Password:
</h2>
</td>
<td><form:password path="upassword"></form:password><form:errors path="upassword" style="color:darkgreen;font-weight:bold"></form:errors>
</td>
                
                
<tr>
<td>
 <h2 style="color:black">
Confirm Password:
</h2></td>
<td><form:password path="uconfirmpassword"></form:password><form:errors path="uconfirmpassword" style="color:darkgreen;font-weight:bold"></form:errors>
</td>
                
                
                
                
                
                
                
                
             
                	<tr>
                     <td><form:label path="uemail"><h2 style="color:black">Email</form:label></td>
                     <td><form:input path="uemail" /><form:errors path="uemail" style="color:darkgreen;font-weight:bold"></form:errors></td>
                </tr> 
                	<tr>
                     <td><form:label path="uphonenumber"><h2 style="color:black">Phone Number</form:label></td>
                     <td><form:input path="uphonenumber" /><form:errors path="uphonenumber" style="color:darkgreen;font-weight:bold"></form:errors></td>
                </tr> 
                 
             	       
       
       				 </table>
       				<tr><td>
                <h5 colspan="0"  ><input type="submit" value="register"></h5>
                 <h5 colspan="0"  ><input type="reset" value="Cancel"></h5>
               
              </td></tr>
             
           
      
           
    </div>
   
      </form:form> 
      
      
   <%@include file="footer.jsp" %>