package com.PcPartPicker.BackEnd.PSU;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PsuController {
    private final PsuRepository psuRepository;

    public PsuController(PsuRepository psuRepository) {
        this.psuRepository = psuRepository;
    }
}
