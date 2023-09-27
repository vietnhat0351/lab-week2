package com.example.labweek2.repositories;

import com.example.labweek2.entities.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class CustomerRepository {

    private EntityManager entityManager;

    public CustomerRepository() {
        entityManager = Persistence.createEntityManagerFactory("default").createEntityManager();
    }
    public List<Customer> getAll() {
        List<Customer> customers = null;
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            customers = entityManager.createNativeQuery("SELECT * FROM customer", Customer.class).getResultList();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return customers;
    }
}
