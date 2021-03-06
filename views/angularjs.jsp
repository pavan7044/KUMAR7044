
 <%@include file="header.jsp" %>





<title>Product Page</title>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootswatch/3.2.0/sandstone/bootstrap.min.css">
<script	src="//ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
<script	src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
<script>
var app = angular.module('myApp', []);
 
function MyController($scope, $http) {

	 $scope.sortType = 'name'; // set the default sort type
	  $scope.sortReverse = false;  // set the default sort order
	  $scope.searchPTitle = '';
	  
        $scope.getDataFromServer = function() {
                $http({
                        method : 'GET',
                        url : 'GsonCon'
                }).success(function(data, status, headers, config) {
                        $scope.prod = data;  
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
           	
           		
           		<td><a href="EditItem?ptid={{p1.ptid}}">Edit</a></td>
           		
           		<td><a href="deleteItem?ptid={{p1.ptid}}">Delete</a></td>
           		
           	
      </tr>
    </tbody>
    
  </table>
  
</div>

 <%@include file="footer.jsp" %>
