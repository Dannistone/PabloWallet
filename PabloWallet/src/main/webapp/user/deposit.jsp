<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Depositar fondos - PabloWallet</title>
    <link rel="stylesheet" type="text/css" href="css/deposit.css">
</head>
<body>
    <h1>Depositar fondos</h1>
    <!-- Formulario para depositar fondos -->
    <form action="depositServlet" method="post">
        <label for="amount">Monto a depositar:</label><br>
        <input type="text" id="amount" name="amount"><br><br>
        <input type="submit" value="Depositar">
    </form>
</body>
</html>
