<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="CSS/styles.css">
<title>Chemistry Administrative Login</title>
</head>
<body>

<div class="container">
	<div class="header">
	<img src="IMG/ChemLogo.png">
	</div>

	<div class="content">
	
		<div class="loginBox">
			<form name="loginForm" action="LoginHandler" method="post">
				<label for="email">Email</label>
				<br/>
				<input type="text" name="email" required/>
				<br/>
				<label for="password">Password</label>
				<br/>
				<input type="password" name="password" required/>
				<br />
				<input type="submit" name="submitButton" value="Login"/>
			</form>
			${errorMessage}
			<p>Trouble logging in? <a href="mailto:example@gmail.com">Contact</a> the web administrator</p>
		</div>
	
    </div>

</div>


</body>
</html>