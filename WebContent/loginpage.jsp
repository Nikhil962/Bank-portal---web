<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WELCOME TO LOGIN PAGE</title>
</head>
<body>
<form action="./loginpagedata" method="post">
<p>FULL NAME : </p>
<input type="text" name="ban1"/>
<br/>
<p>PASSWORD : </p>
<input type="password" name="pass"/>
<br/><br/>${message}
<input type="submit" value="Login">
</form><br/><br/>
<p>NEW USER</p>
<a href=registrationpage.jsp>SIGN UP</a>
</body>
</html>