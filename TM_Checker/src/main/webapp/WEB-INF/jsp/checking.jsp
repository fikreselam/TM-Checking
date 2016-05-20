<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js">
	
</script>
<script
	src="http://localhost:8085/testRakish/resources/js/controllers.js">
	
</script>

<title>Insert title here</title>
</head>
<body ng-app="cartApp">

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



	<div class="container" ng-controller="cartCtrl">
		<div class="jumbotron">

			<h2>Meditators</h2>

		</div>


		


		<table class="table table-condensed">
		<tr><td>Student ID</td><td>Status</td><td>Checking Date</td><td>No of Checking</td></tr>
			<c:forEach var="meditator" items="${meditators}">
				<tbody>
					 
					<tr>
						
						<td>${meditator.student.id}</td>
						<td>${meditator.status}</td>
						<td><c:if test="${meditator.date == null}">
							<div id="error">
								<p style="color:red"> No TM Checking Appointed! </p>
							</div>
						</c:if>	${meditator.date}</td>
						
						<td>${meditator.noOf_checking}</td>


						<td><a href="./edit?medId=${meditator.id}">Edit Status</a>
					</tr>
			</c:forEach>
			</tbody>
		</table>



	</div>
</body>
</html>