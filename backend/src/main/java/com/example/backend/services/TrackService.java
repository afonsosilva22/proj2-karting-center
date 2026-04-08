package com.example.backend.services;

import com.example.backend.models.Track;
import com.example.backend.repositories.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackService {

    @Autowired
    private TrackRepository repository;

    public void saveTrack(Track track) {
        repository.save(track);
    }
}