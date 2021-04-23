//Juan Pablo Ossa - Anderson Serna Maya

package com.mycompany.taller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SumNum extends HttpServlet{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ArrayList<Double> num = new ArrayList();
        Random r = new Random();
        double total = 0;      
        for(int i =0;i<10;i++){
            num.add(r.nextDouble());
        }
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Suma</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Suma de números aleatorios</h1>");
         for(int i =0;i<10;i++){
            out.println("<p>"+"num "+(i+1)+" = "+num.get(i) +"</p>");
            out.println("<br>");
            total+= num.get(i);
        } 
        out.println("<br>");
        out.println("<h1>Total de suma = "+ total +"</h1>"); 
        out.println("</body>");
        out.println("</html>");
    }
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
