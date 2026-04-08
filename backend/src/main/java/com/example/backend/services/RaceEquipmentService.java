package com.example.backend.services;

import com.example.backend.models.RaceEquipment;
import com.example.backend.repositories.RaceEquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RaceEquipmentService {

    @Autowired
    private RaceEquipmentRepository repository;

    public void saveRaceEquipment(RaceEquipment raceEquipment) {
        repository.save(raceEquipment);
    }
}