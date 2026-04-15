package com.example.backend.services;

import com.example.backend.models.Customer;
import com.example.backend.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    public void create(Customer customer) {
        repository.save(customer);
    }
}