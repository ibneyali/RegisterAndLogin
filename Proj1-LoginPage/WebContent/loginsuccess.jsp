<%@page
	import="com.ia.login.dao.* ,java.util.*, com.src.java.locales.ExtendedControl"%>
<%
	ResourceBundle resource = ResourceBundle.getBundle("com.ia.resource.messages", request.getLocale(),
			new ExtendedControl("UTF8"));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>You have login successfully</h1>
		<h2 class="">
			<strong><%=resource.getString("arabic.lyrics")%></strong>
		</h2>
	</div>

</body>
</html>
