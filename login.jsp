<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN PAGE</title>
 <link rel="stylesheet" href="<c:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap.min.css"/>">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="<c:url value="/resources/bootstrap-3.3.6-dist/js/bootstrap.min.js" />"></script>

</head>
<body>
<!-- 
<table><tr><td>
 ${msg}
 </td></tr>
 <tr><td>
 <a href="j_spring_security_logout">logout </a>
 </td></tr>
 </table>-->
	<div class="img1">
	<div class="container">
		<center><font style="color: green;"><h1>${msg}</h1></font></center>
    <div class="row">
        <div class="col-md-4 col-md-offset-7">
            <div class="panel panel-default">
                <div class="panel-heading"> <strong class="">Login</strong>

                </div>
                <div class="panel-body">
                    <form class="form-horizontal" action="perform_login" method="post" role="form"/>
                     <!--<c:if test="${not empty error}">
                   <div class="error" style="color: #ff0000 ;">${error}</div>
               </c:if>-->
                        <div class="form-group">
                            <label for="user_name" class="col-sm-3 control-label">User Name</label>
                            <div class="col-sm-9">
                                <input type="text" name="username" class="form-control" id="user_name" placeholder="UserName" required="true">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="password" class="col-sm-3 control-label">Password</label>
                            <div class="col-sm-9">
                                <input type="password" name="password" class="form-control" id="password" placeholder="Password" required="true">
                            </div>
                        </div>
                        
                        <div class="form-group last">
                            <div class="col-sm-offset-3 col-sm-9">
                             
                               <button type="submit"  class="btn btn-success btn-sm">Login</button>
                                <button type="reset" class="btn btn-default btn-sm">Reset</button> 
                            </div>
                        </div>
                    </form>
                </div>
                 <div class="panel-footer">New User <a href="SignUp" class="">Register here</a>
                </div>
            </div>
        </div>
    </div>
  </div>
</div><br><br>
    <%@ include file="footer.jsp" %>
