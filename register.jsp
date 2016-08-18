



<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


 <%@include file="header.jsp" %>

<body>
	
	<center> <h1 style="color:white">PAVAN MOTORS</h1></center><hr>
	
	
	<nav class="navbar navbar-default">
<div class="container-fluid">
<div class="navbar-header">
<a class="navbar-brand" href="#">MOTORS</a>
</div>
<ul class="nav navbar-nav">
<li class="item active"> <a =href="#"> HOME</a></li>

</ul>
</div>
</nav>
	<div align="center">
        <form:form action="register" method="post" commandName="user" >
            <table border="0">
                
                <tr>
                 <td><form:label path="ufirstname"> <h2 style="color:black">First Name:</form:label></td>
                  <td><form:input path="ufirstname" /></td>
                </tr>
               
                <tr>
                <td><form:label path="ulastname"><h2 style="color:black">Last Name</form:label></td>
                    <td><form:input path="ulastname" /></td>
                </tr><br>
             	<tr>
                    <td><form:label path="username"><h2 style="color:black">User Name</form:label></td>
                   <td><form:input path="username" /></td>
                </tr>     
             	<tr>
                     <td><form:label path="upassword"><h2 style="color:black">password</form:label></td>
                     <td><form:input path="upassword" /></td>
                </tr>     
                	<tr>
                     <td><form:label path="uemail"><h2 style="color:black">Email</form:label></td>
                     <td><form:input path="uemail" /></td>
                </tr> 
                	<tr>
                     <td><form:label path="uphonenumber"><h2 style="color:black">Phone Number</form:label></td>
                     <td><form:input path="uphonenumber" /></td>
                </tr> 
                 
             	       
       
       				 </table>
       				<tr><td>
                <h5 colspan="0" align="center" ><input type="submit" value="register"></h5>
                 <h5 colspan="0" align="center" ><input type="reset" value="Cancel"></h5>
               
              </td></tr>
             
           
      
           
    </div>
   
      </form:form>
    <br><br>
   <%@include file="footer.jsp" %>