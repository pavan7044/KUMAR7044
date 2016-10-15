<%@include file="header.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<div class="row">
  <div class="col-sm-12 col-md-12 col-lg-12">
    <div class="panel panel-default">
      <div class="panel-body">
        <div class="row">
        <form:form method="POST" modelAttribute="forum" action="frm">
<table>
<tr>
        <td>Category :</td>
        <td>
            <form:select path="category">
            <form:option value="Java" />
            <form:option value="Oracle" />
            <form:option value="Spring" />
            <form:option value="Hibernate" />
            </form:select>
        </td>
    </tr>
    <tr>
    <td>Forum Title :</td></tr>
    <tr><td>
    <form:input path="ftitle" /></td>
    </tr>
 
     <tr>
        <td>Forum Content :</td></tr>
        <tr><td><form:textarea path="fcontent" rows="1" cols="150" /></td>
    </tr>
       <tr>
        <td colspan="2"><input type="submit" value="submit"></td>
    </tr>
    
    
    
    
    
    </table>
    </form:form>
<%@include file="forumangular.jsp" %>
    

