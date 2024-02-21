package home;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/casino")
public class Casino extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String login = req.getParameter("user_login");
        String play = req.getParameter("play");
        String play2 = req.getParameter("play2");

        try {
            writer.println(login + "<p> you chose: " + play + "</p>");
            writer.println(login + "<p>you chose: " + play2 + "</p>");

        } finally {
            writer.close();
        }
    }
}
