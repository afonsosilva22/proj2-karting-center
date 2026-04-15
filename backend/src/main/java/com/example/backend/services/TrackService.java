package com.example.backend.services;

import com.example.backend.models.Track;
import com.example.backend.repositories.TrackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrackService {

    private final TrackRepository repository;

    public void create(Track track) {
        repository.save(track);
    }
}