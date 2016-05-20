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
	
	<script type="text/javascript">
									$(".form_datetime").datetimepicker({
										format : 'yyyy-mm-dd'
									});
								</script>
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
						<h1 class="text-center">Signup For Meditation</h1>
					</div>
					<div class="modal-body">

						<form:form modelAttribute="newForm" method="post" role="form"
							class="form-inline">



							<div class="form-group">
								<label for="time">Time: </label>

								<form:select path="time" items="${newForm.timeList}" id="time" />



							</div>

							<div class="form-group">
								<form:input type="date" class="form-control" path="date"
									placeholder="Date" id="date" value="" />

								<%-- <form:input size="16" type="text" path="date" value="2012-06-15 14:45" readonly
									class="form_datetime"/> --%>

								

							</div>
							<div>
								<h4 class="bg-info">Instructor: ${instructor} </h4>
							</div>


							<button type="submit" class="btn btn-default">Signup</button>
						</form:form>
					</div>
					<div class="modal-footer">

						<c:if test="${dateAndTimeCheck == 'NA'}">
							<div id="error">
								<h4 style="color: red">This Date And Time Not Available!</h4>
							</div>
						</c:if>

						<div class="col-md-12">
							<a role="button" href="./welcome">Cancel</a>
						</div>
					</div>
				</div>
			</div>
		</div>



	</div>

</body>
</html>