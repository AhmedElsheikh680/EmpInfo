
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Employee Information</title>
<link href="css/bootstrap.min.css" rel="stylesheet">

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



	<div class="jumbotron">
		<div class="container">
			<h1>Employee Information</h1>

		</div>
	</div>


	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<div class="card border-light mb-3" style="max-width: 20rem;">
					<div class="card-header">Panel Title</div>
					<div class="card-body">

						<a class="btn btn-info btn-lg" href="addEmployee"
							role="button">Add Employee </a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card border-light mb-3" style="max-width: 20rem;">
					<div class="card-header">Panel Title</div>
					<div class="card-body">

						<a class="btn btn-warning btn-lg" href="viewEmployee"
							role="button">View Employee</a>
					</div>
				</div>
			</div>
		</div>
	</div>









	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>