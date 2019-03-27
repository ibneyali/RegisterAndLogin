<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet" type="text/css"	href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css"	href="fonts/iconic/css/material-design-iconic-font.min.css">
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<div align="center">
		<h1>Employee Login Form</h1>
		<form action="<%=request.getContextPath()%>/login" method="post">
			<div class="limiter">
				<div class="container-login100">
					<div class="wrap-login100">
						<form class="login100-form validate-form">
							<span class="login100-form-title p-b-26"> Welcome </span> <span
								class="login100-form-title p-b-48"> <i
								class="zmdi zmdi-font"></i>
							</span>

							<div class="wrap-input100 validate-input"
								data-validate="Valid email is: a@b.c">
								<input class="input100" type="text" name="username"> <span
									class="focus-input100" data-placeholder="Username"></span>
							</div>

							<div class="wrap-input100 validate-input"
								data-validate="Enter password">
								<span class="btn-show-pass"> <i class="zmdi zmdi-eye"></i>
								</span> <input class="input100" type="password" name="password">
								<span class="focus-input100" data-placeholder="Password"></span>
							</div>

							<div class="container-login100-form-btn">
								<div class="wrap-login100-form-btn">
									<div class="login100-form-bgbtn"></div>
									<button class="login100-form-btn" value="submit">Login</button>
								</div>
							</div>

							<div class="text-center p-t-115">
								<span class="txt1"> Don’t have an account? </span> <a
									class="txt2" href="register.jsp"> Sign Up </a>
							</div>
						</form>
					</div>
				</div>
			</div>
</body>


</html>