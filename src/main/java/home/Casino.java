package home;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/casino")
public class Casino extends HttpServlet {
    List<String> answers = new ArrayList<>();
    List<String> answers2 = new ArrayList<>();
    List<String> answers3 = new ArrayList<>();
    List<String> answers4 = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        HttpSession session = req.getSession(true);
        String login = (String) session.getAttribute("user_login");

        String play = req.getParameter("play");
        String play2 = req.getParameter("play2");

        boolean red = play.equals("red") ? answers.add(play) : answers2.add(play);
        boolean red2 = play2.equals("not") ? answers3.add(play2) : answers4.add(play2);


        try (PrintWriter writer = resp.getWriter()) {

            writer.printf("<h2>%s you chose: %s for %d times</h2>%n", login, answers, answers.size());
            writer.printf("<h2>%s you chose: %s for %d times</h2>%n", login, answers2, answers2.size());
            writer.printf("<h2>%s you chose: %s for %d times</h2>%n", login, answers3, answers3.size());
            writer.printf("<h2>%s you chose: %s for %d times</h2>%n", login, answers4, answers4.size());
            // writer.println("<h3>Join in home <a href="+"index2.jsp"+"> -Page- </a></h3>");
            writer.println("<h3>Join in questions <a href= \" index2.jsp  \"> -Page- </a></h3>");

        }
    }
}
