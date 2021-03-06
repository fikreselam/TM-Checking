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
							aria-hidden="true">�</button>
						<h1 class="text-center">Login</h1>
					</div>
					<div class="modal-body">
						<form:form modelAttribute="newLoginForm" method="post"
							class="form col-md-12 center-block">
							<div class="form-group">
								<form:input type="text" class="form-control input-lg"
									placeholder="Student Id" path="id" value="${cookie.user.value}" />
							</div>
							<div class="form-group">
								<form:input type="password" class="form-control input-lg"
									placeholder="Password" path="password" value="" />
							</div>
							<div class="form-group">
								<button type="submit" class="btn btn-primary btn-lg btn-block">Sign
									In</button>
								<span class="pull-right"></span><span><a href="#">Need
										help?</a></span>
							</div>
						</form:form>
					</div>
					<div class="modal-footer">

						<c:if test="${error != null}">
							<div id="error">
								<h4 style="color:red">UserName or Password is Incorrect!</h4>
							</div>
						</c:if>

						<div class="col-md-12">
							<a href="./">Cancel</a>
						</div>
					</div>
				</div>
			</div>
		</div>



	</div>

</body>
</html>