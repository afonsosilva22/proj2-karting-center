package com.example.backend.services;

import com.example.backend.models.Customer;
import com.example.backend.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public void saveCustomer(Customer customer) {
        repository.save(customer);
    }
}