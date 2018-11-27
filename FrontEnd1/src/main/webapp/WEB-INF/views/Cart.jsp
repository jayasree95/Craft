<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ include file="Header.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<c:if test="${ !empty(cartItems) }">
<a href="<c:url value='/cart/clearcart'></c:url>" class="btn btn-danger" pull-left  >
<span class="glyphicon glypicon-remove"></span>
Clear Cart
</a>
</c:if>
<table class="table table-striped">
<thead id="thead">
<tr><th>ProductName</th>
<th>Quantity</th>
<th>Total Price</th>
<th>Remove</th>
</tr>
</thead>
<c:set var="grandTotal" value="0"></c:set>
<tbody id="tbody">
<c:forEach items="${cartItems }" var="cartItem">
<tr>
<td>${cartItem.product.productname }</td>
<td>${cartItem.quantity }</td>
<td>${cartItem.totalPrice }</td>
<c:set var="grandTotal" value="${grandTotal + cartItem.totalPrice }"></c:set>
<!--  grandTotal = grandTotal + cartItem.totalPrice -->
<td><a href="<c:url value='/cart/removecartitem/${cartItem.cartItemId }'></c:url>" class="label label-danger" pull-left >

<span class="glyphicon glyphicon-remove" ></span>Remove
</a></td>

</tr>
</c:forEach>
</tbody>
</table>
Total Price : ${grandTotal }
<c:if test="${empty(cartItems) }">
<h3>Your Cart is Empty</h3>
</c:if>
<c:if test="${ !empty(cartItems) }">
<a href="<c:url value='/cart/shippingaddressform'></c:url>" class="btn btn-success pull-right">
<span class="glyphicon glyphicon-shopping-cart"></span> Place Order  </a>
</c:if>
</div>


</body>
</html>