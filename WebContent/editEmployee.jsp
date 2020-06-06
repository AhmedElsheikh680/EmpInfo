
<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Edit Employee</title>
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

	<br>






	<div class="container">
		<form action="editEmployee" method="post">
				<div class="form-group">
					ID:<br> <input type="text" class="form-control" name="id" value="${requestScope.edit.id}">
				</div>
				<div class="form-group">
					Name:<br> <input type="text" class="form-control" name="name" value="${requestScope.edit.name}">
				</div>
				<div class="form-group">
					Password:<br> <input type="password" class="form-control"
						name="password" value="${requestScope.edit.password}">
				</div>
				<div class="form-group">
					Email:<br> <input type="email" class="form-control"
						name="email" value="${requestScope.edit.email}"/>
				</div> 
				<div class="form-group">
					Gender:<br>
					<div class="form-check">
						<input class="form-check-input position-static" type="radio"
							name="gender" value="male"> Male<br> <input
							class="form-check-input position-static" type="radio"
							name="gender" value="female"> Female
					</div>
				</div>
				<div class="form-group">
					Country: <select class="form-control" name="country">
						<option value="Cairo">Cairo</option>
						<option value="Saudi Arabia">Saudi Arabia</option>
						<option value="Qatar">Qatar</option>
						<option value="Syria">Syria</option>
						<option value="Iraq">Iraq</option>
						<option value="Saudan">Saudan</option>
					</select> <br>

				</div>

				<input type="submit" value="Edit"
					class="btn btn-primary btn-lg pull-right right">
					</form>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>