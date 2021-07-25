<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div style="text-align: center">
<h1>WELCOME TO ONLINE BANK PORTAL</h1>
<b>Hello,(${user.name})</b>
</div>
<br/><br/>
<p>ACCOUNT DETAIL</p>
<a href=accountdetailpage.jsp>click here</a>
<br/>
<p>BALANCE</p>
<a href=checkbalance.jsp>click here</a>
<br/><br/><br/><br/><br/><br/><br/>
<div style="text-align: center">
<a href="./logout">Logout</a>
</div>
</body>
</html>