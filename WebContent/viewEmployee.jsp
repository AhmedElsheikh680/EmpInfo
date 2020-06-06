<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
	
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>All Employee</title>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary"> <a
		class="navbar-brand" href="#">Navbar</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarColor01" aria-controls="navbarColor01"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarColor01">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="#">Home
					<span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Features</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Pricing</a></li>
			<li class="nav-item"><a class="nav-link" href="#">About</a></li>
		</ul>
		<form class="form-inline my-2 my-lg-0">
			<input class="form-control mr-sm-2" type="text" placeholder="Search">
			<button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
		</form>
	</div>
	</nav>

	<%@page import="java.util.*"%>
	<%@page import="java.*"%>





	<div class="container">
		<div class="jumbotron">
			<h1>All Employee</h1>

		</div>
	</div>

	<div class="container">
		<h3>Employee Information:</h3>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Password</th>
					<th>Email</th>
					<th>Gender</th>
					<th>Country</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<c:forEach items="${requestScope.employeeList}" var="e">
					<tbody>
				<tr>
					<td> ${e.id}</td>
					<td>${e.name}</td>
					<td>${e.password}</td>
					<td>${e.email}</td>
					<td>${e.gender}</td>
					<td>${e.country}</td>
					<td><a href="editEmployee?id=${e.id}">Edit</a></td>
					<td><a href="deleteEmployee?id=${e.id}">Delete</a></td>
				</tr>
			</tbody>
			</c:forEach>
			
			
		</table>
	</div>
	<div class="container">
			<a class="btn btn-info btn-lg" href="addEmployee">Add Employee</a>
		
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>