package com.example.backend.services;

import com.example.backend.models.Race;
import com.example.backend.repositories.RaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RaceService {

    private final RaceRepository repository;

    public Race create(Race race) {
        return repository.save(race);
    }

    public List<Race> getAll() {
        return repository.findAll();
    }

    public Race getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Race not found"));
    }
}
