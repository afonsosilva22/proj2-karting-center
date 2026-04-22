package com.example.backend.services;

import com.example.backend.models.RaceKart;
import com.example.backend.models.RaceKartId;
import com.example.backend.repositories.RaceKartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RaceKartService {

    private final RaceKartRepository repository;

    public RaceKart create(RaceKart raceKart) {
        return repository.save(raceKart);
    }

    public List<RaceKart> getAll() {
        return repository.findAll();
    }

    public RaceKart getById(Integer raceId, Integer kartId) {
        RaceKartId id = new RaceKartId();
        id.setRaceId(raceId);
        id.setKartId(kartId);
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("RaceKart not found"));
    }

    public void delete(Integer raceId, Integer kartId) {
        RaceKartId id = new RaceKartId();
        id.setRaceId(raceId);
        id.setKartId(kartId);
        repository.deleteById(id);
    }
}
