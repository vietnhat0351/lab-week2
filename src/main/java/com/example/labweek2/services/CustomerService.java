package com.example.labweek2.services;

import com.example.labweek2.entities.Customer;
import com.example.labweek2.repositories.CustomerRepository;

import java.util.List;

public class CustomerService {

    private CustomerRepository repository;

    public CustomerService() {
        repository = new CustomerRepository();
    }

    public List<Customer> getAll() {
        return repository.getAll();
    }
}
