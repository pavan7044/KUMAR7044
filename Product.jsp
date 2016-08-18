<%@includefile ="header.jsp"%>

<div ng-app="myApp" ng-controller="namesCtrl">

<p>Type a letter in the input field:</p>

<p><input type="search" ng-model="searchText" placeholder="search here" class="form-control"></p>


 <div class="table-responsive">
    <table class="table table-striped table-bordered w3-blue">
    <caption>{{prod.category}}</caption>
    <thead style="color:#CD5C5C">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Brand</th>
        <th>Color</th>
        <th>Size</th>
        <th>Category</th>
        <th>Price</th>
        <th>More</th>
    </tr>
    </thead>
    <tbody>
    
        <tr ng-repeat="p in prod|filter:searchText">
            <td>{{p.pid}} </td>
            <td>{{p.name}}</td>
            <td>{{p.brand}}</td>
            <td>{{p.color}}</td>
            <td>{{p.size}}</td>
            <td>{{p.category}}</td>
            <td>{{p.price|currency}}</td>         
         
       <td><form action="${session.getContextPath()}/shoppingAdda/productdescription" method="post">
     <input type="hidden" name="pid" value={{p.pid}}>
       <input type="hidden" name="name" value={{p.name}}>
        <input type="hidden" name="color" value={{p.color}}>
        <input type="hidden" name="size" value={{p.size}}>
        <input type="hidden" name="price" value={{p.price}}>
         <input type="hidden" name="brand" value={{p.brand}}>
            <input type="hidden" name="category" value={{p.category}}>
        <input type="hidden" name="description" value={{p.description}}>
     <input type="submit" value="click">
</form>
     </td>
    </tr>   
         
        </tbody>
    </table>
</div>
</div>

<script>
angular.module('myApp', []).controller('namesCtrl', function($scope) {
    $scope.prod = ${product};
});
</script>
<%@includefile ="footer.jsp"%>

 