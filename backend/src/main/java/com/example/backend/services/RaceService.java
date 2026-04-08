package com.example.backend.services;

import com.example.backend.models.Race;
import com.example.backend.repositories.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RaceService {

    @Autowired
    private RaceRepository repository;

    public void saveRace(Race race) {
        repository.save(race);
    }
}