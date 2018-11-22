package by.bsu.webxml;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<ul>");
        out.println("<li>lastname:</li>");
        out.println("<li>Firstname:</li>");
        out.println("<li>age</li>");
        out.println("</ul>");
        
        out.println("</body>");
        out.println("</html>");
        
    }
}