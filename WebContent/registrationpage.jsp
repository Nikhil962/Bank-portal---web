<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WELCOME TO REGISTRATION PAGE</title>
</head>
<body>
<form action="./registrationpagedata" method="post">
<p>FULL NAME : </p>
<input type="text" name="n1"/>
<br/>
<p>DOB : </p>
<input type="text" name="dob1"/>
<br/>
<p>BANK ACCOUNT NUMBER : </p>
<input type="text" name="ban1"/>
<br/>
<p>IFSE CODE : </p>
<input type="text" name="ifse1"/>
<br/>
<p>MOBILE NUMBER : </p>
<input type="text" name="mon1"/>
<br/>
<p>TOTAL AMOUNT IN BANK ACCOUNT : </p>
<input type="text" name="a1"/>
<br/>
<p>PASSWORD : </p>
<input type="password" name="pass"/>
<br/><br/>
<input type="submit" value="Register">
</form><br/><br/>
<p>ALREADY REGISTERD</p>
<a href=loginpage.jsp>LOGIN</a>
</body>
</html>