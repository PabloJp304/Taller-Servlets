//Juan Pablo Ossa - Anderson Serna Maya

package com.mycompany.taller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hipotenusa extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        float a = Float.parseFloat(request.getParameter("cateto1"));
        float b = Float.parseFloat(request.getParameter("cateto2"));
        double h = Math.sqrt(((Math.pow(a, 2))+(Math.pow(b,2))));
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hipotenusa</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hipotenusa</h1>");
        out.println("<p>La longitud de la hipotenusa es : "+ h +"</p>");
        out.println("</body>");
        out.println("</html>");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
