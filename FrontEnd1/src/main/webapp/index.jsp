<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html><html>
<body>
<head>
  
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">


<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Craft Site</title>

<div class="container">
<style>


li {
    float: left;
}

li a {
    display: block;
    color: #666;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active)
 {
    
background-color: #ddd;
}

li a.active 
{
    
color: white;
    
background-color: #4CAF50;

}
.carousel-inner img {
      width: 100%;
      height: 100%;
  }
body  {
      background-image: url("aa.jpg");
      background-color: #cccccc;
}
</style>
</head>
<body>



<div class="container">
<img src="<c:url value='/resources/images/aa.jpg'></c:url>" height="200px" width="1135px">
<nav class="navbar navbar-default" id="navbar-bg">
<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" 
   data-toggle="collapse" data-target="#navbardemo" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
</div>
<div class="collapse navbar-collapse" id="navbardemo">
<ul class="nav navbar-nav">

<li><a href="<c:url value="/home"></c:url>"><span class="glyphicon glyphicon-home"></span>Home</a></li>
	
<li><a href="<c:url value="/all/AboutPage"></c:url>">AboutUs</a></li>
<li><a href="<c:url value="/all/getregistrationform"></c:url>">Sign Up</a></li>	
<li><a href="<c:url value="/login"></c:url>">Login</a></li>	
<li><a href="<c:url value="/logout"></c:url>">Logout</a></li>
<img src="<c:url value='/resources/images/aa.jpg'></c:url>" height="30px" width="70px"></a></li>	
</ul>
</div>
</head>
</body>
</html>
