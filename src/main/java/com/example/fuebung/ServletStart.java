package com.example.fuebung;

import com.patienten.Patient;
import com.users.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletStart", value = "/ServletStart")
public class ServletStart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        Users us1 = new Users("herr", "123");

        Users us2 = new Users("frau", "123");

        em.getTransaction().begin();
        em.persist(us1);
        em.persist(us2);
        em.getTransaction().commit();

        EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("pat");
        EntityManager em2 = emf2.createEntityManager();

        Patient p1 = new Patient("Jürgen", "berger","1", "herr", "männlich");
        Patient p2 = new Patient("linda", "berger","2", "frau", "weibblich");

        em2.getTransaction().begin();
        em2.persist(p1);
        em2.persist(p2);
        em2.getTransaction().commit();
        response.sendRedirect("indexTwo.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
