package alke.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import alke.model.User;
import alke.dao.UserDao;

@WebServlet("/user")
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao;

    public void init() {
        userDao = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            String action = request.getParameter("action");
            
            switch (action) {
                case "register":
                    registerUser(request, response);
                    break;
                case "login":
                    loginUser(request, response);
                    break;
                default:
                    response.sendRedirect("index.jsp");
                    break;
            }
        } catch (Exception e) {
            // Manejo de la excepción aquí
            e.printStackTrace(); // Imprimir la traza de la excepción
            // Puedes redirigir a una página de error o hacer cualquier otra acción según tu lógica de manejo de errores
        }
    }


    private void registerUser(HttpServletRequest request, HttpServletResponse response) 
            throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

     // Crear un nuevo usuario con valores específicos
        User newUser = new User("nombreUsuario", "contraseña", "correo@example.com", 0.0);
        
        userDao.saveUser(newUser);
        response.sendRedirect("login.jsp");
    }

    private void loginUser(HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = userDao.validateUser(username, password);

        if (user != null) {
            request.getSession().setAttribute("user", user);
            response.sendRedirect("user/dashboard.jsp");
        } else {
            response.sendRedirect("login.jsp?error=1");
        }
    }
}
