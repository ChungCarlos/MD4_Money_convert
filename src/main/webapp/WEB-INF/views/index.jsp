<!-- index.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>USD to VND Converter</title>
</head>
<body>
<h1>USD to VND Converter</h1>
<form action="convert" method="post">
    <label for="rate">Exchange Rate:</label>
    <input type="number" id="rate" name="rate" required> <br>
    <label for="usd">USD Amount:</label>
    <input type="number" id="usd" name="usd" required><br>
    <button type="submit">Convert</button>
</form>
</body>
</html>