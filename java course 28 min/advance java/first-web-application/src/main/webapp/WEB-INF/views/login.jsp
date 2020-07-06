<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Im from jsp</title>
</head>
<body>
<h1>welcome to jsp via servlet ${name}</h1>
<form action="/login.do"  method="post">
<p><font color="red">${error}</font></p>
Name:<input type="text" name = "name"/> password:<input type="password" name = "password"/>

<input type="submit" value="login">
</form>
</body>
</html>	