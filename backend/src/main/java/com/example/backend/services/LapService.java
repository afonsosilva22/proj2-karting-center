package com.example.backend.services;

import com.example.backend.models.Lap;
import com.example.backend.repositories.LapRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LapService {

    private final LapRepository repository;

    public void addNew(Lap lap) {
        repository.save(lap);
    }
}