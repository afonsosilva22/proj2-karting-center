package com.example.backend.services;

import com.example.backend.models.Race;
import com.example.backend.repositories.RaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RaceService {

    private final RaceRepository repository;

    public void addNew(Race race) {
        repository.save(race);
    }
}