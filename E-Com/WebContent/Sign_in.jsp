<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Sign in</title>
<link rel="stylesheet" href="/E-Com/sign_in_style.css">

</head>
<body>
	<div class="login-page">
		<div class="form">
				<form action="SignInServlet" method="post">
					<input type="text" placeholder="Username" name="un" /> 
					<input type="password" placeholder="Password" name="pass" /> 
					<button type="submit" value="Sign In" >Sign In</button>
					
				</form>
		</div>
	</div>

</body>
</html>