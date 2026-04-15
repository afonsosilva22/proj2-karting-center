package com.example.backend.services;

import com.example.backend.models.Employee;
import com.example.backend.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;

    public void create(Employee employee) {
        repository.save(employee);
    }
}