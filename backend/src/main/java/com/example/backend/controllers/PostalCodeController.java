package com.example.backend.controllers;

import com.example.backend.models.PostalCode;
import com.example.backend.services.PostalCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/postal-codes")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class PostalCodeController {

    private final PostalCodeService service;

    @PostMapping("/create")
    public ResponseEntity<PostalCode> create(@RequestBody PostalCode postalCode) {
        PostalCode saved = service.create(postalCode);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<PostalCode>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/get/{postalCode}")
    public ResponseEntity<PostalCode> getByPostalCode(@PathVariable String postalCode) {
        return ResponseEntity.ok(service.getByPostalCode(postalCode));
    }

    @PutMapping("/update/{postalCode}")
    public ResponseEntity<PostalCode> update(@PathVariable String postalCode, @RequestBody PostalCode postalCodeBody) {
        return ResponseEntity.ok(service.update(postalCode, postalCodeBody));
    }
}
