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

    @PostMapping("/add")
    public Customer addNewCustomer(@RequestBody Customer customer) {
        service.addNew(customer);
        return customer;
    }
}
