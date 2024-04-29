import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="LoginServlet",urlPatterns= {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Vérifier les informations de connexion
        if ("admin1".equals(username) && "pass1".equals(password)) {
            // Si les informations sont valides, rediriger vers Acceuil.jsp
            request.getRequestDispatcher("Acceuil.jsp").forward(request, response);
        } else {
            // Si les informations ne sont pas valides, afficher un message d'erreur
            response.getWriter().println("Invalid username or password");
        }
    }
}

