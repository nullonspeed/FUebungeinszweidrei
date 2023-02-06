package com.example.fuebung;

import java.io.*;
import java.sql.*;

import com.users.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");







        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/db","db","db");

            PreparedStatement ps = c.prepareStatement("select * from users where username=? and password=?");
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            Connection c1 = DriverManager.getConnection("jdbc:derby://localhost:1527/patient","patient","patient");
            PreparedStatement ps1 = c1.prepareStatement("select * from patient where username=?");
            ps1.setString(1, username);
            ResultSet rs1 = ps1.executeQuery();
            rs1.next();
            String vorname = rs1.getString(6);
            String nachname = rs1.getString(3);
            String patnr = rs1.getString(4);
            String geschlecht = rs1.getString(2);

            request.setAttribute("vorname", vorname);
            request.setAttribute("username", username);
            request.setAttribute("nachname", nachname);
            request.setAttribute("patnr", patnr);
            request.setAttribute("geschlecht", geschlecht);
            RequestDispatcher rd = request.getRequestDispatcher("loginSucced.jsp");
          //  response.sendRedirect("");
            rd.forward(request, response);
        }else{

            response.sendRedirect("indexTwo.jsp");
        }

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    public void destroy() {
    }
}