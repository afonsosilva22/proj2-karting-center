package com.example.backend.services;

import com.example.backend.models.BlacklistEntry;
import com.example.backend.repositories.BlacklistEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlacklistEntryService {

    @Autowired
    private BlacklistEntryRepository repository;

    public void saveBlacklistEntry(BlacklistEntry blacklistEntry) {
        repository.save(blacklistEntry);
    }
}