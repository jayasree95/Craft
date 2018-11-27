<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h2>Supplier Table</h2>                                                          
<table class="table table-bordered">
<thead>
<tr>
  <th>SupplierID</th>
  <th>SupplierName</th>
   <th>SupplierDescription</th>
<th>Deleting  </th>
<th> Editing </th>
</tr>
 </thead>
 <tbody>
 <c:forEach items="${supplierlist}" var="j">
 <tr>
  <td>${j.supplierid}</td>
  <td>${j.suppliername}</td>
   <td>${j.supplierdesc}</td>
<td><a href="<c:url value='EditSupplier?id=${j.supplierid}'></c:url>">Edit</a></td>
<td><a href="<c:url value='DeleteSupplier?id=${j.supplierid}'></c:url>">Delete</a></td>
</tr>
</c:forEach>
 </tbody>
</table>
 </div>

</body>
</html>