package com.example.backend.services;

import com.example.backend.models.BlacklistEntry;
import com.example.backend.repositories.BlacklistEntryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlacklistEntryService {

    private final BlacklistEntryRepository repository;

    public void create(BlacklistEntry blacklistEntry) {
        repository.save(blacklistEntry);
    }
}