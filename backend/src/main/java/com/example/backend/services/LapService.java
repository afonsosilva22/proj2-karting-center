package com.example.backend.services;

import com.example.backend.models.Lap;
import com.example.backend.models.LapId;
import com.example.backend.repositories.LapRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LapService {

    private final LapRepository repository;

    public Lap create(Lap lap) {
        return repository.save(lap);
    }

    public List<Lap> getAll() {
        return repository.findAll();
    }

    public Lap getById(Integer raceId, Integer kartId, Integer lapNumber) {
        LapId id = new LapId();
        id.setRaceId(raceId);
        id.setKartId(kartId);
        id.setLapNumber(lapNumber);
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lap not found"));
    }

    public void delete(Integer raceId, Integer kartId, Integer lapNumber) {
        LapId id = new LapId();
        id.setRaceId(raceId);
        id.setKartId(kartId);
        id.setLapNumber(lapNumber);
        repository.deleteById(id);
    }
}
