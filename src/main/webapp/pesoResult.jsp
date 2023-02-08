<%@ page language="java" contentType="text/html;charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Peso Results</title>
</head>
<body>
	<h1>USD to Pesos</h1>
	<p>$${userConversion.getAmountUSD()} USD is ${userConversion.getPesoConversion()} Pesos</p>
	<button onclick="window.location.href='USDInput.jsp';">Next</button>
</body>
</html>