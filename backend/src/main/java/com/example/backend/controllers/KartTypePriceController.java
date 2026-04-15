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

    @PostMapping("/add")
    public KartTypePrice addNewKartTypePrice(@RequestBody KartTypePrice kartTypePrice) {
        service.addNew(kartTypePrice);
        return kartTypePrice;
    }
}
