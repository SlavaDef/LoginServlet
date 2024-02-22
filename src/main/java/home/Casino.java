package home;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/casino")
public class Casino extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String login = req.getParameter("login");
        String play = req.getParameter("play");
        String play2 = req.getParameter("play2");

        List<String> answers = new ArrayList<>();
        answers.add(play);
        List<String> answers2 = new ArrayList<>();
        answers2.add(play2);

        try {
            writer.println( "<p>" + login +" you chose: " + answers + "for " +answers.size()+ " times"+ "</p>");
            writer.println("<p>" + login + " you chose: " + answers2 + "for " +answers2.size()+ " times"+ "</p>");
            // writer.println("<h3>Join in home <a href="+"index2.jsp"+"> -Page- </a></h3>");
            writer.println("<h3>Join in home <a href= \" index2.jsp  \"> -Page- </a></h3>");

        } finally {
            writer.close();
        }
    }
}
