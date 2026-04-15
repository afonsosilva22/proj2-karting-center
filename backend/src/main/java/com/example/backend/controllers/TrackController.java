package com.example.backend.controllers;

import com.example.backend.models.Track;
import com.example.backend.services.TrackService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tracks")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class TrackController {

    private final TrackService service;

    @PostMapping("/add")
    public Track addNewTrack(@RequestBody Track track) {
        service.addNew(track);
        return track;
    }
}
