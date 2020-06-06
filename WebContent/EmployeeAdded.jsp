<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Employee Added</title>
<style>
	.success {
	    color: #155724;
    background-color: #d4edda;
    border-color: #c3e6cb;
    padding: .75rem 1.25rem;
    border: 1px solid transparent;
    border-radius: .25rem;
    font-weight: bold;
    font-size: 31px;
	}
</style>
</head>
<body>

<div class="alert alert-success success" role="alert">

 Done Successfully !

</div>

<jsp:include page="employeeForm.html"></jsp:include>


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>