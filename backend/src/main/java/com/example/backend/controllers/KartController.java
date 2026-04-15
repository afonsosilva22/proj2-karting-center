package com.example.backend.controllers;

import com.example.backend.models.Kart;
import com.example.backend.services.KartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/karts")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class KartController {

    private final KartService service;

    @PostMapping("/add")
    public Kart addNewKart(@RequestBody Kart kart) {
        service.addNew(kart);
        return kart;
    }
}
