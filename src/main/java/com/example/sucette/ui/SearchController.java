package com.example.sucette.ui;

import com.example.sucette.Search;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@RequestScoped
@Named
public class SearchController {
    @PersistenceContext
    EntityManager entityManager;

    public List<Search> getProducts(){
        TypedQuery <Search> query = entityManager.createQuery("select s from Search s", Search.class);
        return query.getResultList();
    }
}
