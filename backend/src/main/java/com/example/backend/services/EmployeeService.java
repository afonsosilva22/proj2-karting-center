package com.example.backend.services;

import com.example.backend.models.Employee;
import com.example.backend.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void saveEmployee(Employee employee) {
        repository.save(employee);
    }
}