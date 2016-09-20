
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>More Details</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script>
	document.write('<base href="' + document.location + '" />');
</script>
<link href="./resources/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<link href="./resources/css/style.css" rel="stylesheet" media="screen">
<script data-require="angular.js@1.0.x"
	src="http://code.angularjs.org/1.0.7/angular.min.js"
	data-semver="1.0.7"></script>
</head>
<body>
	<br>
	<br>
	<br>
	<table class="table table-striped">
		<tr>

			<th>Product Name</th>
			<th>Product Description</th>
			<th>Product Price</th>
			<th>Product Quantity</th>
			<th>Product Image</th>
		</tr>
		<tr>

			<td>${product.ptname}</td>
			<td>${product.ptcolor}</td>
			<td>${product.ptmodel}</td>

			<td><img src="resources/images/${product.ptname}.jpg"
				style="height: 200px; width: 200px;" "/></td>
			<td><a href="UserCheck">Add this one to Cart</a>
		</tr>

	</table>

</body>
</html>












































<%-- <!DOCTYPE html>
<html lang="en">
<head>
<title>View Product Details</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script>document.write('<base href="' + document.location + '" />');</script>
<link href="./resources/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="./resources/css/style.css" rel="stylesheet" media="screen">
<script data-require="angular.js@1.0.x" src="http://code.angularjs.org/1.0.7/angular.min.js" data-semver="1.0.7"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
<div class="container-fluid">
<div class="navbar-header">
<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
<span class="icon-bar"></span>
<span class="icon-bar"></span>
<span class="icon-bar"></span>
</button>
<a class="navbar-brand" href="#"><span class="glyphicon glyphicon-home"></span></a>
</div>

</div>
</nav>
<div>

</div>
<div>
<div class="container">
<div ng-app="myApp" ng-controller="dataCtrl">

<hr></hr>
<table class="table table-striped">
<tr>
<th>Id</th>
<th>Product Name</th>
<th>Product Price</th>
<th>Quantity</th>
 <th>Product Image</th>
</tr>
    <tr >
         <td>${product.ptid}</td>
        <td>${product.ptname}</td>
        <td>${product.ptprice}</td>
        <td>${product.ptquantity}</td>
        <td>${product.ptimage}</td>
        <td><img src="resources/images/${product.ptname}.jpg" style=height:100px;width:100px;"/></td>
        <td><a href="myUCheck">Add to Cart</a></td>
        
    </tr>    
</table>
</div>

</body>

</html>


 --%>
















<%-- <%@includefile ="header.jsp"%>


<h2>WELCOME TO PRODUCTS PAGE</h2>


<form>
    <div class="form-group">
      <div class="input-group">
        <div class="input-group-addon"><i class="fa fa-search"></i></div>
        <input type="text" class="form-control" placeholder="Search Product Name" ng-model="searchPTitle">      
       </div>      
    </div>
  </form>
  
  <table class="table table-bordered table-striped">
    
    <thead>
      <tr>
      <td>
          <a href="#" ng-click="sortType = 'ptid'; sortReverse = !sortReverse">
            Product Id 
            <span ng-show="sortType == 'ptid' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'ptid' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        
        <td>
          <a href="#" ng-click="sortType = 'ptname'; sortReverse = !sortReverse">
            Product Name 
            <span ng-show="sortType == 'ptname' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'ptname' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'ptmodel'; sortReverse = !sortReverse">
            Product Model 
            <span ng-show="sortType == 'ptname' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'ptname' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'ptcolor'; sortReverse = !sortReverse">
          Quantity
            <span ng-show="sortType == 'ptquantity' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'ptquantity' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'ptprice'; sortReverse = !sortReverse">
          Price
            <span ng-show="sortType == 'ptprice' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'ptprice' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'ptauthor'; sortReverse = !sortReverse">
          color
            <span ng-show="sortType == 'ptauthor' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'ptauthor' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        
        </tr>
    </thead>
    
    <tbody>
      <tr ng-repeat="p1 in prod | orderBy:sortType:sortReverse | filter:searchPTitle">
           		<td>{{p1.ptid}}</td>
           		<td>{{p1.ptname}}</td>
           		<td>{{p1.ptmodel}}</td>
           		<td>{{p1.ptquantity}}</td>
           		<td>{{p1.ptprice}}</td>
           		<td>{{p1.ptcolor}}</td>
           	<td><a href="viewdetailsnormal
           		
           		
      </tr>
      
      
      
      
      
      
      
    </tbody>
    
  </table>

























<%@includefile ="footer.jsp"%>
 --%>