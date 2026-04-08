package com.example.backend.services;

import com.example.backend.models.Maintenance;
import com.example.backend.repositories.MaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaintenanceService {

    @Autowired
    private MaintenanceRepository repository;

    public void saveMaintenance(Maintenance maintenance) {
        repository.save(maintenance);
    }
}