<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
<title>Insert title here</title>
</head>
<body background="<c:url value="/resources/img/header.jpg" />">

	<div class="container">
		
		
		
<div id="loginModal" class="modal show" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog modal-sm">
  <div class="modal-content">
      <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
          <h3 class="text-center">TM Checking Status Report!</h3>
      </div>
      <div class="modal-body">
          
          
          <table class="table table-condensed">
		<tr><td>Status</td><td>No of Checking</td></tr>
			 
				<tbody>
					 
					<tr>
						
						
						<td>${report.status}</td>
						
						<td>${report.noOf_checking}</td>


						
					</tr>
			 
			</tbody>
		</table>
          
          
          
      </div>
      <div class="modal-footer">
          <div class="col-md-12">
          <a href="./welcome" role="button" >Cancel</a>
		  </div>	
      </div>
  </div>
  </div>
</div>
		
		



	</div>

</body>
</html>