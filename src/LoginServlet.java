import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends javax.servlet.http.HttpServlet{
     final static String LOGIN = "admin";
     final static String PASS = "admin";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if (LOGIN.equals(login)&& PASS.equals(password)){
            HttpSession session = req.getSession(true);
            session.setAttribute("user_login", login);
        }
        resp.sendRedirect("index.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a = req.getParameter("a");
        HttpSession session = req.getSession(false);
        if ("exit".equals(a)&&(session!=null))
            session.removeAttribute("user_login");
        resp.sendRedirect("index.jsp");
    }
}

