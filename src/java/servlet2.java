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
public class servlet2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String name ="";

//            Traverse the cookie and fetch the value using for 
            Cookie cookie[] = request.getCookies();

            for (Cookie c : cookie) {
                if (c.getName().equals("go")) {
                    name = c.getValue();
                }
            }
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet2</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Welcome back " + name  + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
