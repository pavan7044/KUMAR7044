<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Blog Page</title>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootswatch/3.2.0/sandstone/bootstrap.min.css">


<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/jquery-1.9.1.mini.js"></script>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>


    
    <!-- <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"> -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>
    
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootswatch/3.2.0/sandstone/bootstrap.min.css">
<script	src="//ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
<script	src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>




<script	src="//ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
<script	src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
<script>
var app = angular.module('myApp', []);
 
function MyController($scope, $http) {

	 $scope.sortType = 'name'; // set the default sort type
	  $scope.sortReverse = false;  // set the default sort order
	  $scope.searchBTitle = '';
	  
        $scope.getDataFromServer = function() {
                $http({
                        method : 'GET',
                        url : 'GsonCon'
                }).success(function(data, status, headers, config) {
                        $scope.blog = data;  
                }).error(function(data, status, headers, config) {
                        // called asynchronously if an error occurs
                        // or server returns response with an error status.
                });
        };
};



</script>
</head>
<body>

<div class="container" ng-app="myApp" ng-controller="MyController" ng-init="getDataFromServer()">
  
  <form>
    <div class="form-group">
      <div class="input-group">
        <div class="input-group-addon"><i class="fa fa-search"></i></div>
        <input type="text" class="form-control" placeholder="Search Blog Name" ng-model="searchBTitle">      
       </div>      
    </div>
  </form>
  
  <table class="table table-bordered table-striped">
    
    <thead>
      <tr>
      <td>
          <a href="#" ng-click="sortType = 'bid'; sortReverse = !sortReverse">
            Blog Id 
            <span ng-show="sortType == 'bid' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'bid' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        
        <td>
          <a href="#" ng-click="sortType = 'blogtitle'; sortReverse = !sortReverse">
            Blog Name 
            <span ng-show="sortType == 'blogtitle' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'blogtitle' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'bcontent'; sortReverse = !sortReverse">
          Content 
            <span ng-show="sortType == 'bcontent' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'bcontent' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        
        
        
        <td>
          <a href="#" ng-click="sortType = 'username'; sortReverse = !sortReverse">
          User Name
            <span ng-show="sortType == 'username' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'username' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'blogcreationdate'; sortReverse = !sortReverse">
          Creation Date
            <span ng-show="sortType == 'blogcreationdate' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'blogcreationdate' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        </tr>
    </thead>
    
    <tbody>
      <tr ng-repeat="b1 in blog | orderBy:sortType:sortReverse | filter:searchBTitle">
           		<td>{{b1.bid}}</td>
           		<td>{{b1.blogtitle}}</td>
           		<td>{{b1.bcontent}}</td>
           	
           		<td>{{b1.username}}</td>
           		<td>{{b1.blogcreationdate}}</td>
           	
      </tr>
    </tbody>
    
  </table>
  
</div>

</body>
</html>