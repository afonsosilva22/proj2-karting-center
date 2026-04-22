package com.example.backend.services;

import com.example.backend.models.BlacklistEntry;
import com.example.backend.repositories.BlacklistEntryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlacklistEntryService {

    private final BlacklistEntryRepository repository;

    public BlacklistEntry create(BlacklistEntry blacklistEntry) {
        return repository.save(blacklistEntry);
    }

    public List<BlacklistEntry> getAll() {
        return repository.findAll();
    }

    public BlacklistEntry getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("BlacklistEntry not found"));
    }
}
