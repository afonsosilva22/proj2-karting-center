package com.example.backend.services;

import com.example.backend.models.Maintenance;
import com.example.backend.repositories.MaintenanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MaintenanceService {

    private final MaintenanceRepository repository;

    public void create(Maintenance maintenance) {
        repository.save(maintenance);
    }
}