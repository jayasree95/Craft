<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
   <c:url var="url" value="/all/edit"></c:url>
    <form:form method="post" action="edit" modelAttribute="Cate">
    Category ID:<form:input path="categoryid" readonly="true"/><br>
    <br>
    Enter CategoryName:<form:input path="categoryname"/><br>
    <br>
    Enter CategoryDescription:<form:input path="categorydesc"/><br>
    <br>
    <input type="submit" value="Edit"/>
    </form:form>
    
   </div>
</body>
</html>