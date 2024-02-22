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
    List<String> answers = new ArrayList<>();
    List<String> answers2 = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String login = req.getParameter("login");
        String play = req.getParameter("play");
        String play2 = req.getParameter("play2");


        answers.add(play);

        answers2.add(play2);

        try (PrintWriter writer = resp.getWriter()) {

            writer.println("<p>" + login + " you chose: " + answers + "for " + answers.size() + " times" + "</p>");
            writer.println("<p>" + login + " you chose: " + answers2 + "for " + answers2.size() + " times" + "</p>");
            // writer.println("<h3>Join in home <a href="+"index2.jsp"+"> -Page- </a></h3>");
            writer.println("<h3>Join in questions <a href= \" index2.jsp  \"> -Page- </a></h3>");

        }
    }
}
