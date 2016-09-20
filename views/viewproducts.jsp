
<%@includefile ="header.jsp"%>


<style>
body

 {
    background-image:url(resources/images/logo/logozz.jpg);
    width: "1450";
     height: "700";
    background-size:cover;
    
}
</style>

<b><center><font face="Comic Sans MS"><h1>Welcome, Admin!</h1></font></center></b>
<div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-center">
          <li class="active"><a href="Tvscaursol"><b>Home</b></a></li>             
                 
	        <li class="dropdown">
	            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><b>Manage</b><b class="caret"></b></a>
	            <ul class="dropdown-menu multi-column columns-3">
		            <div class="row">
			            <div class="col-sm-4">
				            <ul class="multi-column-dropdown">
					            <li><b>Products</b></li>					      
					            <li class="divider"></li>
					            <li><a href="Product" target="_self">Add</a></li>
					            <li><a href="Product" target="_self">Remove</a></li>
					            <li><a href="Product" target="_self">Update</a></li>
					            <!--  <li><a href="#">Search</a></li>-->
					            <li><a href="viewProducts" target="_self">View all</a></li>
				            </ul>
			            </div>
			            <div class="col-sm-4">
				            <ul class="multi-column-dropdown">
					            <li><b>Category</b></li>
					            <li class="divider"></li>
					            <li><a href="EditCategory" target="_self">Add</a></li>
					            <li><a href="EditCategory" target="_self">Remove</a></li>
					            <li><a href="EditCategory" target="_self">Update</a></li>
					            <!-- <li><a href="#">Search</a></li>-->
					            <li><a href="categories" target="_self">View all</a></li>
				            </ul>
			            </div>
			          			            
			       
			            <div class="col-sm-4">
				            <ul class="multi-column-dropdown">
					            <li><b>Suppliers</b></li>
					            <li class="divider"></li>
					            <li><a href="supplierpage" target="_self">Add</a></li>
					            <li><a href="suppliers" target="_self">Remove</a></li>
					            <li><a href="suppliers" target="_self">Update</a></li>
					            <!--  <li><a href="#">Search</a></li>-->
					            <li><a href="suppliers" target="_self">View all</a></li>
				            </ul>
			            </div>
		            </div>
		            		            </div>
		            
	            </ul>
	        </li>
              
          </ul>         
        </div><!--/.nav-collapse -->
      </div>
</div>
<br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br>

<ul><b>
  <li>To change your password, go to Change Password.</li>
  <li>To manage the categories, products and suppliers, go to Manage.</li>
  <li>To change the terms and conditions of the website, go to Change T&C.</li>
  
  </b></ul>
<%@includefile ="footer.jsp"%>