<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="css/styles_login.css">
    <title>Iniciar sesión - PabloWallet</title>
</head>
<body>
    <div class="container">
        <h1 class="title">Iniciar Sesión</h1>
    <!-- Formulario para iniciar sesión -->
    <form action="loginServlet" method="post">
        <label for="username">Nombre de usuario:</label><br>
        <input type="text" id="username" name="username"><br>
        <label for="password">Contraseña:</label><br>
        <input type="password" id="password" name="password"><br><br>
        <input type="submit" value="Iniciar sesión">
    </form>
</div>
</html>
