package home;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/casino")
public class Casino extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.sendRedirect("index2.jsp");
        //  resp.setContentType("text/html"); // Content-Type: text/html
            // MIME types

           // PrintWriter pw = resp.getWriter();
          //  pw.println("<html><head><title>Servlets_Test</title></head>"); // імя вкладки
          //  pw.println("<body><h1>The weatrer is fine today?      Red or black?</h1></body></html>");

    }
}
