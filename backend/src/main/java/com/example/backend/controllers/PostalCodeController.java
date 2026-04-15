package com.example.backend.controllers;

import com.example.backend.models.PostalCode;
import com.example.backend.services.PostalCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/postal-codes")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class PostalCodeController {

    private final PostalCodeService service;

    @PostMapping("/create")
    public PostalCode create(@RequestBody PostalCode postalCode) {
        service.create(postalCode);
        return postalCode;
    }
}
