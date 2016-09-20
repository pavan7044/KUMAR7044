<%@include file="header.jsp"%>



<style>
body

 {
    background-image:url(resources/images/logo/r3.jpg);
    background-repeat:no-repeat;
    background-size:cover;
    
}
</style>
	<HR>
	<CENTER>
		<CENTER>



			<br> 
			<form action="perform_login"
				method="post">

				<table>
					<center>
						<h2>
							<font color="green"><u>Enter your credentials below </u></font>
						</h2>
						<br>



						<tr>
							<td style="color: black">USERNAME:</td>
							<td><input type="text" name="username" /></td>
						</tr>
						<br> <br> <br>
						<tr>
							<td style="color: black">PASSWORD:</td>
							<td><input type="password" name="password" /></td>
						</tr>
						<tr>
							<td><input type="submit" value="Login" /></td>
							<td><input type="reset" value="Reset" /></td>
						</tr>
				</table>
			</form>
		</CENTER>






		<br> <br>
		<br> <br> <br> <br><br> <br>
		<br> <br> <br> <br>
		<%@include file="footer.jsp"%>