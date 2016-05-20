<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%> --%>
	
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%-- <link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/creative.css" type="text/css">


<link href="<c:url value="resources/css/creative.css" />"
	rel="stylesheet"> --%>
	
	
	<link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/font-awesome.min.css" rel="stylesheet">
    <link href="resources/css/prettyPhoto.css" rel="stylesheet">
    <link href="resources/css/animate.min.css" rel="stylesheet">
    <link href="resources/css/main.css" rel="stylesheet">
    <link href="resources/css/responsive.css" rel="stylesheet">
	

<style type="text/css">
h1, h2, h3, h4, h5, h6 {
	font-family: 'Open Sans', 'Helvetica Neue', Arial, sans-serif;
}
</style>
</head>
<body background="<c:url value="/resources/img/header.jpg" />">

	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href=".">MUM TM Checking</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li class="active"><a href="./welcome">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Checking <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="./signup">Signup For Checking</a></li>

						<li><a href="./getReport">Status Report</a></li>
					</ul></li>
				<li><a href="./notify"><span
						class="glyphicon glyphicon-envelope"></span></a></li>

				<c:choose>
					<c:when test="${role == 'INSTRUCTOR'}">
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">Entry <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="./announcment">Announcment</a></li>

							</ul></li>

					</c:when>
				</c:choose>
				<c:choose>
					<c:when test="${role == 'INSTRUCTOR'}">
						<li><a href="./getMeditators">Meditators</a></li>
					</c:when>
				</c:choose>

			</ul>
			<ul class="nav navbar-nav navbar-right">
				<!-- <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li> -->
				<li><a href="./logout"><span
						class="glyphicon glyphicon-log-out"></span> Logout</a></li>
			</ul>
		</div>
	</div>
	</nav>




	<div class="container">
		
		<div class="container-fluid">
			<!-- <div class="header-content">
				<div class="header-content-inner">

					
					
				</div>
			</div>
 -->
			 <div class="container">
			 <h1 class="bg-info" align="center">MUM Announcments</h1>
				<c:forEach var="event" items="${annoucments}">
				<div class="row">
				<div class="box">
					<tr>
						<td>
							<div class="row">
								<div class="col-sm-12">
									<div class="panel panel-default text-center">
										<div class="panel-heading">
											<h2 class="bg-warning">${event.title}</h2>
										</div>
										<div>
											<%-- ${event.image} --%>
											<!-- <img src="resources/img/piano.jpg" alt="" /> -->
											<img src="'${event.image}'" alt="" />
											<img src="<c:url value="${event.image}" />" alt="" />
										</div>
										<div class="panel-footer">
											<h4 class="bg-info" class="bg-warning">${event.description}</h4>

											<a href="./like?id=${event.id}" class="btn btn-lg"><span
												class="glyphicon glyphicon-heart"></span></a>
										</div>
									</div>
								</div>
							</div>
						</td>
					</tr>
					</div>
					</div>
				</c:forEach>
			 </div>

		</div>
	</div>
	
	
	<script src="resources/js/jquery.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/jquery.prettyPhoto.js"></script>
    <script src="resources/js/jquery.isotope.min.js"></script>
    <script src="resources/js/main.js"></script>
    <script src="resources/js/wow.min.js"></script>
</body>
</html>