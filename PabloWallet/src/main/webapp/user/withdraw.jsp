<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Retirar fondos - PabloWallet</title>
    <link rel="stylesheet" type="text/css" href="css/withdraw.css">
</head>
<body>
    <h1>Retirar fondos</h1>
    <!-- Formulario para retirar fondos -->
    <form action="withdrawServlet" method="post">
        <label for="amount">Monto a retirar:</label><br>
        <input type="text" id="amount" name="amount"><br><br>
        <input type="submit" value="Retirar">
    </form>
</body>
</html>
