package com.example.backend.services;

import com.example.backend.models.RaceKart;
import com.example.backend.repositories.RaceKartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RaceKartService {

    @Autowired
    private RaceKartRepository repository;

    public void saveRaceKart(RaceKart raceKart) {
        repository.save(raceKart);
    }
}