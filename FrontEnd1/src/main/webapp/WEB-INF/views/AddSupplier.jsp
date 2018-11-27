<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<title>Supplier Form</title>
</head>
<body>
<h2>Supplier Form</h2>
<div class="container">
<c:url var="url" value="/all/add"></c:url>
    <form:form method="post" action="addSupplier" modelAttribute="Suppliers">
 
    Enter SupplierName:<form:input path="suppliername"/><br>
    <br>
    Enter SupplierDescription:<form:input path="supplierdesc"/><br>
    <br>
    <input type="submit" value="Add"/>
    </form:form>
    
   </div>
</body>
</html>