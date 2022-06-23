package Controller;

import DAO.ActivityDao;
import Model.Activity;
import java.io.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "activities", value = "/")
public class Activities extends HttpServlet {
    public void init() {}

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");

        ActivityDao dao = new ActivityDao();
        List<Activity> activities = dao.selectAll();
        
        RequestDispatcher rd = null;
        request.setAttribute("activities", activities);   
        rd = request.getRequestDispatcher("views/activities.jsp");
        rd.forward(request, response);
    }

    public void destroy() {
    }
}