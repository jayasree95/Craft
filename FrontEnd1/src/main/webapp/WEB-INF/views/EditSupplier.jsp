<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<c:url var="url" value="/all/edit"></c:url>
    <form:form method="post" action="edits" modelAttribute="supp">
    SupplierID:<form:input path="supplierid" readonly="true"/><br>
    <br>
    Enter SupplierName:<form:input path="suppliername"/><br>
    <br>
    Enter SupplierDescription:<form:input path="supplierdesc"/><br>
    <br>
    <input type="submit" value="Edit"/>
    </form:form>
    
   </div>

</body>
</html>