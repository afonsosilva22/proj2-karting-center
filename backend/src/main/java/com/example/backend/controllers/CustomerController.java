package com.example.backend.controllers;

import com.example.backend.models.Customer;
import com.example.backend.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class CustomerController {

    private final CustomerService service;

    @PostMapping("/create")
    public Customer create(@RequestBody Customer customer) {
        service.create(customer);
        return customer;
    }
}
