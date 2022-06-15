package Controller;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "activities", value = "/activities")
public class Activities extends HttpServlet {
    public void init() {}

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/xml");
        try {
//            request.setAttribute("activities", activities);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(Activities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void destroy() {
    }
}