package com.example.backend.services;

import com.example.backend.models.RaceEquipment;
import com.example.backend.repositories.RaceEquipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RaceEquipmentService {

    private final RaceEquipmentRepository repository;

    public void create(RaceEquipment raceEquipment) {
        repository.save(raceEquipment);
    }
}