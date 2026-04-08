package com.example.backend.services;

import com.example.backend.models.Lap;
import com.example.backend.repositories.LapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LapService {

    @Autowired
    private LapRepository repository;

    public void saveLap(Lap lap) {
        repository.save(lap);
    }
}