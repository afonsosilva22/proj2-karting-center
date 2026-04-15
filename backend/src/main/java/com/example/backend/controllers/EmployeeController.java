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

    @PostMapping("/add")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        service.addNew(employee);
        return employee;
    }
}
