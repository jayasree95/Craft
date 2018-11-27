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
<h2>Product Table</h2>                                                          
<table class="table table-striped" border="1">
<thead>
<tr>
  <th>ProductID</th>
  <th>ProductName</th>
   <th>ProductDescription</th>
  <th>Quantity</th>
  <th>Price</th>
  <th>Image</th>
<th></th>
<th>  </th>
</tr>
 </thead>
 <tbody>
 <c:forEach items="${productlist}" var="j">
 <tr>
  <td>${j.id}</td>
  <td>${j.productname}</td>
   <td>${j.productdesc}</td>
 <td>${j.quantity}</td>
 <td>${j.price}</td>
 <td><img src="<c:url value='/resources/images/${j.id }.png'></c:url>" height="40px" width="50px"></td>
<td><a href="<c:url value='edit?id=${j.id}'></c:url>">Edit</a></td>
<td><a href="<c:url value='Delete?id=${j.id}'></c:url>">Delete</a></td>
</tr>
</c:forEach>
 </tbody>
</table>
 </div>

</body>
</html>





