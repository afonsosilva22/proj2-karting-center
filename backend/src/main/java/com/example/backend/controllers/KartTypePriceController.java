package com.example.backend.controllers;

import com.example.backend.models.KartTypePrice;
import com.example.backend.services.KartTypePriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kart-type-prices")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class KartTypePriceController {

    private final KartTypePriceService service;

    @PostMapping("/create")
    public KartTypePrice create(@RequestBody KartTypePrice kartTypePrice) {
        service.create(kartTypePrice);
        return kartTypePrice;
    }
}
