package com.example.backend.services;

import com.example.backend.models.RaceEquipment;
import com.example.backend.models.RaceEquipmentId;
import com.example.backend.repositories.RaceEquipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RaceEquipmentService {

    private final RaceEquipmentRepository repository;

    public RaceEquipment create(RaceEquipment raceEquipment) {
        return repository.save(raceEquipment);
    }

    public List<RaceEquipment> getAll() {
        return repository.findAll();
    }

    public RaceEquipment getById(Integer raceId, Integer equipmentId) {
        RaceEquipmentId id = new RaceEquipmentId();
        id.setRaceId(raceId);
        id.setEquipmentId(equipmentId);
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("RaceEquipment not found"));
    }

    public void delete(Integer raceId, Integer equipmentId) {
        RaceEquipmentId id = new RaceEquipmentId();
        id.setRaceId(raceId);
        id.setEquipmentId(equipmentId);
        repository.deleteById(id);
    }
}
