<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./pdfgenpagedata" method="get">
<p>ACCOUNT DETAIL</p>
<br><b>Name : ${user.name}</b>
<br><b>DOB : ${user.dof}</b>
<br><b>Account Number : ${user.bankaccountno}</b>
<br><b>IFSE code : ${user.ifsecode}</b>
<br><b>Mobile number : ${user.mobileno}</b>
<br><b>Balance : ${user.amount}</b>
<br><b>Password : ${user.pass}</b>
<input type="submit" value="Create PDF Report">
<br/><br/><br/><br/><br/><br/><br/>
<div style="text-align: center">
<a href="./back">BACK</a>
</div>
</form>
</body>
</html>