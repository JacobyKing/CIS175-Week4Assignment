<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Convert To</title>
</head>
<body>
	<h1>USD Currency Converter</h1>
	<form action="getUSDToEuroServlet" method="post">
	<a>Enter a USD amount to convert to euros: $</a>
	<input type="text" name="usdAmount" size="10"><br>
	<input type="submit" value="Calculate"/>
	</form>
</body>
</html>