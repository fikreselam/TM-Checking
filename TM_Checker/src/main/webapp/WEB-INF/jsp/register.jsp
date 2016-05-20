<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<style>
.jumbotron {
	background-color: #f4511e;
	color: #fff;
}

.btn {
	padding: 10px 20px;
	background-color: #333;
	color: #f1f1f1;
	border-radius: 0;
	transition: .2s;
}

.btn:hover, .btn:focus {
	border: 1px solid #333;
	background-color: #fff;
	color: #000;
}
</style>

<title>Insert title here</title>
</head>
<body background="<c:url value="/resources/img/header.jpg" />">

	<div class="container">



		<div id="loginModal" class="modal show" tabindex="-1" role="dialog"
			aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">×</button>
						<h1 class="text-center">Login</h1>
					</div>
					<div class="modal-body">

						<form:form modelAttribute="newStudent" method="post" role="form"
							class="form">



							<div class="form-group">
								<label for="id">User ID: </label>
								<form:input type="text" class="form-control" path="id" id="id"
									value="" />

							</div>

							<div class="form-group">
								<label for="firstName">First Name: </label>
								<form:input type="text" class="form-control" path="fristName"
									id="firstName" value="" />

							</div>


							<div class="form-group">
								<label for="lastName">Last Name: </label>
								<form:input type="text" class="form-control" path="lastName"
									id="lastName" value="" />

							</div>


							<div class="form-group">
								<label for="email">Email Address: </label>
								<form:input type="email" class="form-control" path="email"
									id="email" value="" />

							</div>


							<div class="form-group">
								<label for="pwd">Password: </label>
								<form:input type="password" class="form-control" path="pass"
									id="pwd" value="" />

							</div>

							<div class="form-group">
								<label for="role">Time: </label>

								<form:select path="role" items="${newStudent.roles}" id="role" />



							</div>


							<button type="submit" class="btn btn-default">Register</button>
						</form:form>

					</div>
					<div class="modal-footer">
					<c:if test="${exists != null}">
							<div id="error">
								<h4 style="color:red">UserId Already Exists!</h4>
							</div>
						</c:if>
						<div class="col-md-12">
							<a href="./index" role="button">Cancel</a>
						</div>
					</div>
				</div>
			</div>
		</div>



	</div>

</body>
</html>