 <%@include file="header1.jsp" %>
<style>
body

 {
    background-image:url(resources/images/logo/ff2.jpg);
    background-repeat:no-repeat;
    background-size:cover;
    
}
</style>

<form method ="post" action="supr">
   <center>
   <table width="350">
   
    <tr><td><font color="red"><h4>Supplier Name:</h4></font></td><td> <input type="text" name = "spname"></td></tr>
    <tr><td><font color="red"><h4>Supplier Phone Number:</h4></font></td><td> <input type="text" name = "sphno"></td></tr> 
  <tr><td><font color="red"><h4>Supplier Email:</h4></font></td><td> <input type="text" name = "semail"></td></tr>
    <tr><td><font color="red"><h4>Supplier Address:</h4></font></td><td> <input type="text" name = "spaddress"></td></tr> 
  
 
        <tr><td><button type="submit" class="btn btn-success">Submit</button></td>
        <td><button type="reset" class="btn btn-default">Reset</button> </td></tr>   
      
      </table>
      </center>
      </form>
<br><br><br><br><br><br><br><br><br><br><br><br>

 <%@include file="footer.jsp" %>
