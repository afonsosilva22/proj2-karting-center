package com.example.backend.controllers;

import com.example.backend.models.Maintenance;
import com.example.backend.services.MaintenanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/maintenances")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class MaintenanceController {

    private final MaintenanceService service;

    @PostMapping("/add")
    public Maintenance addNewMaintenance(@RequestBody Maintenance maintenance) {
        service.addNew(maintenance);
        return maintenance;
    }
}
