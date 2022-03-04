/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author r1303
 */
public class servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            
            String name = request.getParameter("nm");
            
//          Pass the value using cookie 
            Cookie cookie = new Cookie("go", name +"");
            response.addCookie(cookie);
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=\'servlet2\'>");
            out.println("<h1>This is the Cookie 2nd page</h1>");
            out.println("<input type=\'submit\'>");
            out.print("</form>");
            out.println("</body>");
            out.println("</html>");
        }

    }

}
