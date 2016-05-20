<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Creative - Meditate EveryDay</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	<link rel="stylesheet"
	href="resources/css/bootstrap.min.css" type="text/css">
	<link href="<c:url value="resources/css/bootstrap.min.css" />" rel="stylesheet">
<!-- Custom Fonts -->
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic'
	rel='stylesheet' type='text/css'>




<link rel="stylesheet"
	href="resources/font-awesome/css/font-awesome.min.css" type="text/css">
	
	<link href="<c:url value="resources/font-awesome/css/font-awesome.min.css" />" rel="stylesheet">

<!-- Plugin CSS -->
<link rel="stylesheet" href="resources/css/animate.min.css"
	type="text/css">
	
	<link href="<c:url value="resources/css/animate.min.css" />" rel="stylesheet">

<!-- Custom CSS -->
<link rel="stylesheet" href="resources/css/creative.css" type="text/css">


	<link href="<c:url value="resources/css/creative.css" />" rel="stylesheet">



</head>
<%--  background="<c:url value="bgimage.jpg" />" --%>
<body id="page-top" >

	<nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand page-scroll" href="#page-top">Daily
				Meditation</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li><a class="page-scroll" href="./login">Login</a></li>

				<li><a class="page-scroll" href="./register">Register</a></li>

				<li><a class="page-scroll" href="#portfolio">Contact Us</a></li>

			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>

	<header background="<c:url value="/resources/img/header.jpg" />">
	<div class="header-content">
		<div class="header-content-inner">
			<h1>Daily experience of pure awareness</h1>
			<hr>
			<p>The Transcendental Meditation program allows the conscious
				mind to identify itself with the unified field of all the loaw of
				nature, the total potential of natural law, in transcendental
				consciousness.</p>
			<a
				href="https://www.mum.edu/about-mum/consciousness-based-education/transcendental-meditation-technique/"
				class="btn btn-primary btn-xl page-scroll">Find Out More</a>
		</div>
	</div>
	</header>

	<section class="bg-primary" id="about">
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2 text-center">
				<h2 class="section-heading">Transcendental Meditation
					Technique!</h2>
				<hr class="light">
				<br><br><br>
				<p class="text-faded">All students and faculty at MUM practice
					the Transcendental Meditation® (TM) technique. It is a simple,
					natural, effortless process practiced 15–20 minutes twice daily
					while sitting comfortably with eyes closed. It is not a religion,
					philosophy, or lifestyle. More than six million people worldwide
					have learned the TM technique — people of all ages, cultures, and
					socioeconomic backgrounds.!</p>
				<a href="#" class="btn btn-default btn-xl">Get Started!</a>
			</div>
		</div>
	</div>
	</section>

	<section id="services">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2 class="section-heading">Contact us</h2>
				<hr class="primary">
			</div>
		</div>
	</div>
	</section>


	<section class="no-padding" id="portfolio">
	<div class="container-fluid">
		<div class="row no-gutter">
			<div class="col-lg-4 col-sm-6">
				<a href="#" class="portfolio-box"> 
				<!-- <img  src="resources/img/1.jpg" alt=""> -->
				<!-- <img src="resources/img/piano.jpg" alt="" /> -->
				
				<img src="<c:url value="/resources/img/1.jpg" />" alt="" />
					<div class="portfolio-box-caption">
						<div class="portfolio-box-caption-content">
							<div class="project-category text-faded">Daniel</div>
							<div class="project-name">Abrham</div>
						</div>
					</div>
				</a>
			</div>
			<div class="col-lg-4 col-sm-6">
				<a href="#" class="portfolio-box"> <img
					src="resources/img/2.jpg" class="img-responsive" alt="">
					<div class="portfolio-box-caption">
						<div class="portfolio-box-caption-content">
							<div class="project-category text-faded">Fikreselam</div>
							<div class="project-name">Elala</div>
						</div>
					</div>
				</a>
			</div>
			<div class="col-lg-4 col-sm-6">
				<a href="#" class="portfolio-box"> <img
					src="resources/img/3.jpg" class="img-responsive" alt="">
					<div class="portfolio-box-caption">
						<div class="portfolio-box-caption-content">
							<div class="project-category text-faded">Maysam</div>
							<div class="project-name">Gamini</div>
						</div>
					</div>
				</a>
			</div>

		</div>
	</div>
	</section>

	<aside class="bg-dark">
	<div class="container text-center">
		<div class="call-to-action">
			<h2>Be Creative!</h2>
		</div>
	</div>
	</aside>

	<section id="contact">
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2 text-center">
				<h2 class="section-heading">Get Intouch with MUM!</h2>
				<hr class="primary">
				<p>Ready to start Meditation!</p>
			</div>
			<div class="col-lg-4 col-lg-offset-2 text-center">
				<i class="fa fa-phone fa-3x wow bounceIn"></i>
				<p>Admissions Phone: 800-369-6480</p>
			</div>
			<div class="col-lg-4 text-center">
				<i class="fa fa-envelope-o fa-3x wow bounceIn" data-wow-delay=".1s"></i>
				<p>
					<a href="https://www.mum.edu/">https://www.mum.edu/</a>
				</p>
			</div>
		</div>
	</div>
	</section>

	<!-- jQuery -->
	<script src="resources/js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="resources/js/bootstrap.min.js"></script>

	<!-- Plugin JavaScript -->
	<script src="resources/js/jquery.easing.min.js"></script>
	<script src="resources/js/jquery.fittext.js"></script>
	<script src="resources/js/wow.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="resources/js/creative.js"></script>

</body>

</html>
