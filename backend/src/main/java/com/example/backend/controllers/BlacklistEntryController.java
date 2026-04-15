package com.example.backend.controllers;

import com.example.backend.models.BlacklistEntry;
import com.example.backend.services.BlacklistEntryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/blacklist-entries")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class BlacklistEntryController {

    private final BlacklistEntryService service;

    @PostMapping("/create")
    public BlacklistEntry create(@RequestBody BlacklistEntry blacklistEntry) {
        service.create(blacklistEntry);
        return blacklistEntry;
    }

}
