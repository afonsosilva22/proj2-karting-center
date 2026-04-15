package com.example.backend.controllers;

import com.example.backend.models.Rental;
import com.example.backend.services.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rentals")
@RequiredArgsConstructor
@CrossOrigin(origins ="*")
public class RentalController {

    private final RentalService service;

    @PostMapping("/add")
    public Rental addNewRental(@RequestBody Rental rental) {
        service.addNew(rental);
        return rental;
    }
}
