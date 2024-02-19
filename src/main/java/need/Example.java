package need;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;



    @WebServlet("/hello") // ендпоинт по якому заходимо
    public class Example extends HttpServlet { // обяз треба унаслідуватися

        public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException { // перевизначення методу
            resp.setContentType("text/html"); // Content-Type: text/html
            // MIME types

            PrintWriter pw = resp.getWriter();
            pw.println("<html><head><title>Servlets_Test</title></head>"); // імя вкладки
            pw.println("<body><h1>Hello, Java Junior 6:)</h1></body></html>");
            pw.println("<body><h2>Hello, Java Junior 8:)</h2></body></html>");
            pw.close();
        }




    }

