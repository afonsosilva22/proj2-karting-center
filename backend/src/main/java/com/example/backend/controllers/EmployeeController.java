package com.example.backend.controllers;

import com.example.backend.models.Employee;
import com.example.backend.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class EmployeeController {

    private final EmployeeService service;

    @PostMapping("/create")
    public Employee create(@RequestBody Employee employee) {
        service.create(employee);
        return employee;
    }
}
