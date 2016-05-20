<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
  <div class="modal-dialog">
  <div class="modal-content">
      <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
          <h3 class="text-center">Update Student Status</h3>
      </div>
      <div class="modal-body">
          <form:form class="form col-md-12 center-block">
            
            <table class="table table-hover">
            	<tbody>
            	<tr><td>Student Status:</td><td>${checking.status}</td></tr>
            	<tr><td>NO of Checking:</td><td>${checking.noOf_checking}</td></tr>
            	</tbody>
            </table>
            
            
            
            <div class="form-group">
              <a href="./addChecking" class="btn btn-primary btn-lg btn-block" role="button">Checked</a>
              <span class="pull-right"></span><span><a href="#">Need help?</a></span>
            </div>
          </form:form>
      </div>
      <div class="modal-footer">
          <div class="col-md-12">
          <a href="./checking">Cancel</a>
		  </div>	
      </div>
  </div>
  </div>
</div>
		
		
	
	</div>

</body>
</html>