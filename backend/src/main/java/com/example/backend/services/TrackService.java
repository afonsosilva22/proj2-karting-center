package com.example.backend.services;

import com.example.backend.models.Track;
import com.example.backend.repositories.TrackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrackService {

    private final TrackRepository repository;

    public Track create(Track track) {
        return repository.save(track);
    }

    public List<Track> getAll() {
        return repository.findAll();
    }

    public Track getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Track not found"));
    }

    public Track update(Integer id, Track track) {
        track.setId(id);
        return repository.save(track);
    }
}
