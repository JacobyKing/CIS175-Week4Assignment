<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Euro Result</title>
</head>
<body>
	<h1>USD to Euros</h1>
	<p>$${userConversion.getAmountUSD()} USD is ${userConversion.getEuroConversion()} Euros</p>
	<button onclick="window.location.href='index.jsp';">Home</button>
</body>
</html>