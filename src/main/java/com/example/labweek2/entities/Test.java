package com.example.labweek2.entities;

import com.example.labweek2.enums.EmployeeStatus;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.sql.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        Employee employee = new Employee("Nhat", new Date(1), "nhat@gmail.com", "123", "29 le loi", EmployeeStatus.ACTIVE);

        transaction.begin();
        List<Employee> employees = entityManager.createNativeQuery("SELECT * FROM employee", Employee.class).getResultList();
        transaction.commit();

        System.out.println(employees);
    }
}
