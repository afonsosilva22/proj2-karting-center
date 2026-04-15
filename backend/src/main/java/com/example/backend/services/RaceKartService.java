package com.example.backend.services;

import com.example.backend.models.RaceKart;
import com.example.backend.repositories.RaceKartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RaceKartService {

    private final RaceKartRepository repository;

    public void addNew(RaceKart raceKart) {
        repository.save(raceKart);
    }
}