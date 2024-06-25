package alke.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener parámetros de la solicitud
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Lógica de verificación de credenciales
        if (username.equals("usuario") && password.equals("contraseña")) {
            // Credenciales válidas, redirigir a la página de inicio
            response.sendRedirect("index.jsp");
        } else {
            // Credenciales inválidas, redirigir a la página de inicio de sesión con un mensaje de error
            response.sendRedirect("login.jsp?error=1");
        }
    }
}
