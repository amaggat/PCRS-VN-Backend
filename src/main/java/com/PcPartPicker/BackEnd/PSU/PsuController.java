package com.PcPartPicker.BackEnd.PSU;

import org.springframework.stereotype.Controller;

@Controller
public class PsuController {
    private final PsuRepository psuRepository;

    public PsuController(PsuRepository psuRepository) {
        this.psuRepository = psuRepository;
    }
}
