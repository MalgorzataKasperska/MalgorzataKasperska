package com.example.sucette.ui;

import com.example.sucette.Search;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SearchController extends HttpServlet {

    EntityManager entityManager;
    String filter;

    public SearchController() {
        this.entityManager = Persistence.createEntityManagerFactory("default").createEntityManager();
    }


    public List<Search> getProducts(String filter) {
        final String queryStr = "select s from Search s where productName like '%" + filter + "%'";
        TypedQuery<Search> query = entityManager.createQuery(queryStr, Search.class);
        return query.getResultList();
    }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final List<Search> searchList = getProducts(filter);

        req.setAttribute("products", searchList);


        RequestDispatcher rd = req.getRequestDispatcher("search.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        filter = req.getParameter("fname");
    }
}
