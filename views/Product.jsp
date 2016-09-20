
 <%@include file="header.jsp" %>



<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="resources/bootstrap/js/jquery-1.9.1.mini.js"></script>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="font-awesome/css/font-awesome.min.css" />
<script type="text/javascript"
	src="resources/bootstrap/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap.min.js"></script>

<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Kaushan+Script'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700'
	rel='stylesheet' type='text/css'>
<style>
.itm {
	width: 70%;
	margin: auto;
}

body {
	background-color: aqua;
}
</style>



<title>Product</title>


</head>
<body>






<div align="center">
		<form:form action="productadd" method="post"
			commandName="product" modelAttribute="product"
			enctype="multipart/form-data">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h1 style="color: darkgreen">
							<u>Manage your Products</u>
						</h1></td>
				</tr>
				<tr>
					<td><h3 style="color: blue">Product name:</td>
					<td><form:input path="ptname" /></td>
				</tr>
<tr>
					<td><h3 style="color: blue">Product Color:</td>
					<td><form:input path="ptcolor" /></td>
				</tr>
				<tr>
					<td><h3 style="color: blue">Product Model:</td>
					<td><form:input path="ptmodel" /></td>
				</tr>
		
				<tr>
					<td><h3 style="color: blue">Product price:</td>
					<td><form:input path="ptprice" /></td>
				</tr>

				<tr>
					<td><h3 style="color: blue">Product quantity:</td>
					<td><form:input path="ptquantity" /></td>
				</tr>




				<tr>
					<td><h3 style="color: blue">Product Image :</td>
					<td><form:input type="file" path="img" /></td>
				</tr>
				
				
				
				
				
				
				
			 <tr><td>
                <tr>
				<td><form:label path="supplier">
				
				<h3 style="color: blue">Supplier By:</form:label></td>
				 <td><form:select path="supplier.spname" items="${supplierList}" itemValue="spname" itemLabel="spname" /></td>
			</tr>
			
			 
			 <tr><td>
                <tr>
				<td><form:label path="category">
				<h3 style="color: blue">Category By:</form:label></td>
				 <td><form:select path="category.sname" items="${categoryList}" itemValue="sname" itemLabel="sname" /></td>
			</tr>
			  
		 
			
		
				
				
				
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="submit" /></td>
					 <td colspan="2" align="center"><input type="submit"
						value="Reset" /> 
						
						<td type="reset" ><button class="btn btn-default">Reset</button></td>
						
						</td>

				</tr>

			</table>
		</form:form>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<%@include file="angularjs.jsp"%>
	<br>
	
	
	
	 
	





































































<%-- 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Product!</title>
  
 <style>
 body{
 background-image:url('resources/images/logozz.jpg');
 background-size:cover;
 }
 </style>
  
<script type="text/javascript" src="https://gc.kis.scr.kaspersky-labs.com/F735D753-CB57-2144-9288-48F787DAC4FC/main.js" charset="UTF-8"></script></head>
<body>
<br><br><br><br><br><br><br><br><br>
<center><h2><font color="magenta">Sign Up!</font></h2></center>
      
       <form:form action="Product" method="post" commandName="product" modelAttribute="product" enctype="multipart/form-data">
<table>
<tr>
<td>Product Name : </td>
<td><form:input path="ptname" /><form:label path="ptname" style="color:red"></form:label></td>
</tr>
<tr>
<td>Product Description : </td>
<td><form:input path="ptdescription" /><form:label path="ptdescription" style="color:red"></form:label></td>
</tr>
<tr>
<td>Product color : </td>
<td><form:input path="ptcolor" /><form:label path="ptcolor" style="color:red"></form:label></td>
</tr><tr>
<td>Product Model : </td>
<td><form:input path="ptmodel" /><form:label path="ptmodel" style="color:red"></form:label></td>
</tr>
<tr>
<td>Product Price : </td>
<td><form:input path="ptprice"/><form:label path="ptprice" style="color:red"></form:label></td></tr>
<tr>
<td>Product Quantity :</td>
<td><form:input path="ptquantity"/><form:label path="ptquantity" style="color:red"></form:label></td></tr>








<tr colspan="2">
<td><input type="submit" value="Add Product"></td>
</tr>
</table>
</form:form>
      
      
<%@include file="angularjs.jsp" %>
       --%>








































































 