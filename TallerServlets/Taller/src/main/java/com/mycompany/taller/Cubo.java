//Juan Pablo Ossa - Anderson Serna Maya

package com.mycompany.taller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cubo extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int numero = Integer.parseInt(request.getParameter("numero"));
        response.setContentType("text/html;charset=UTF-8");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cubo</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div>");
        out.println("<h1>Elevar numero al cubo</h1>");
        out.println("<p>El número: "+numero+" elevado al cubo es = "+Math.pow(numero,3)+"</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
