<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Blog Page</title>
</head>
<body>

<form:form method="POST" commandName="blog" action="bpost">
<table>
    <tr>
    <td>Title :</td></tr>
    <tr><td>
    <form:input path="blogtitle" width="50" /></td>
    </tr>
    <tr>
        <td>Content :</td></tr>
        <tr><td><form:textarea path="bcontent" rows="10" cols="150" /></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="Post"></td>
    </tr>
    </table>
    </form:form>
    <%@include file="angularjs.jsp" %>
    </body>
    </html>
     --%>
     
     
     
     
     
     
     
     
     
     
     
     <%@ include file="header.jsp" %>
     
     
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="en">
    <head> 
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/jquery-1.9.1.mini.js"></script>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<!--  <link rel="stylesheet" type="text/css" href="font-awesome/css/font-awesome.min.css" /> -->
    <script type="text/javascript" src="resources/bootstrap/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
    
    <!-- <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"> -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>
    
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootswatch/3.2.0/sandstone/bootstrap.min.css">
<script	src="//ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
<script	src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>

<style>
.itm{
width:70%;
margin: auto;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <script>
var app = angular.module('myApp', []);

function BlogController($scope, $http) {

	  $scope.sortType     = 'name'; // set the default sort type
	  $scope.sortReverse  = false;  // set the default sort order
	  $scope.searchDeviceName   = '';     // set the default search/filter term

        $scope.getDataFromServer = function() {
                $http({
                        method : 'GET',
                        url : 'GsonCon'
                }).success(function(data, status, headers, config) {
                        $scope.Blogs = data; alert(data);
                }).error(function(data, status, headers, config) {
                        
                });

        };
};
</script>

<title>Blog page</title>
</head>


<body>
Blog page
<br>
Hi ${uname} , you are in blog page...
<br>
 <h1><center>Blog Creation Page</center></h1>
<div class="container">
<!-- 
			<div class="row main">
				<div class="panel-heading">
	               <div class="panel-title text-center">
	               		
	               		<hr />
	               	</div>
	            </div> 
	            </div>
	             -->
			<%-- 	<div class="main-login main-center">
					<form class="form-horizontal" method="post" action="addBlogRecordRequest" modelAttribute="blog">
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Title</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<form:input type="text" path="blogtitle" class="form-control" name="blogtitle" id="blogtitle"  placeholder="Enter Blog Title"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Content</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>									
									<textarea name="blogcontent" id="blogcontent" rows="30" cols="100"></textarea>
								</div>
							</div>
						</div>
						
						<div class="form-group ">
							<input type="submit" value="Post" class="btn btn-primary"  />							
						</div>
					</form> --%>
					
					<form:form method="POST" commandName="blog" action="bpost">
<table>
    <tr>
    <td>Title :</td></tr>
    <tr><td>
    <form:input path="blogtitle" width="50" /></td>
    </tr>
    <tr>
        <td>Content :</td></tr>
        <tr><td><form:textarea path="bcontent" rows="10" cols="150" /></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="Post"></td>
    </tr>
    </table>
    </form:form>
				</div>
			
		</div>					

<!--         TABLE      -->


<div class="container" ng-app="myApp" ng-controller="BlogController">
  
  
  

 

  <div ng-init="getDataFromServer();">
  <table class="table table-bordered table-striped">
    
   <thead>
   
      <tr>
     	 <td>
            <a href="#" ng-click="sortType = 'blogtitle'; sortReverse = !sortReverse">
             <b>Blog Title</b> 
             <span ng-show="sortType == 'blogtitle' && !sortReverse" class="fa fa-caret-down"></span>
             <span ng-show="sortType == 'blogtitle' && sortReverse" class="fa fa-caret-up"></span>
           </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'bcontent'; sortReverse = !sortReverse">
            <b>Blog Content</b>
            <span ng-show="sortType == 'bcontent' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'bcontent' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>   
       <td>
          <a href="#" ng-click="sortType = 'username'; sortReverse = !sortReverse">
          	<b>Created User</b> 
            <span ng-show="sortType == 'username' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'username' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>        
             
       <td>
          <a href="#" ng-click="sortType = 'blogcreationdate'; sortReverse = !sortReverse">
          	<b>Creation Date</b> 
            <span ng-show="sortType == 'blogcreationdate' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'blogcreationdate' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>            
      
                
       </tr>
      
    </thead>
       
    <tbody>
   
      <tr ng-repeat="b in Blogs | orderBy:sortType:sortReverse | filter:searchBlogTitle">
       
        <td>{{ b.blogtitle}}</td>
        <td>{{ b.bcontent }}...<a href="getFullBlogInfoReq?id={{b.BlogID}}">Read Complete</a></td>
        <td>{{ b.username }}</td>
        <td>{{ b.blogcreationdate }}</td>    
      
      
  </tr>
    </tbody>
    
  </table>
  </div>
</div>

<%@ include file="footer.jsp" %>

     
     
     
     
     
     
     
     
     
     
     
     
     
     
     