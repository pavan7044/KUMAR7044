 <%@include file="header1.jsp" %>
<style>
body

 {
    background-image:url(resources/images/logo/ff2.jpg);
    background-repeat:no-repeat;
    background-size:cover;
    
}
</style>

<form method ="post" action="catgry">
   <center>
   <table width="350">
   
    <tr><td><font color="red"><h4>Category Name:</h4></font></td><td> <input type="text" name = "sname"></td></tr>
    <tr><td><font color="red"><h4>Category Description:</h4></font></td><td> <input type="text" name = "sdescription"></td></tr>
  
  
 
        <tr><td><button type="submit" class="btn btn-success">Submit</button></td>
        <td><button type="reset" class="btn btn-default">Reset</button> </td></tr>   
      
      </table>
      </center>
      </form>
      <br><br><br><br><br><br><br><br><br><br>
 <%@include file="footer.jsp" %>
