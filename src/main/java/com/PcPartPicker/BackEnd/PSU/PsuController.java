package com.PcPartPicker.BackEnd.PSU;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PsuController {
    private final PsuRepository psuRepository;

    public PsuController(PsuRepository psuRepository) {
        this.psuRepository = psuRepository;
    }

    @GetMapping("/powerSupplyUnits")
    public List<PowerSupplyUnit> list(){
        return psuRepository.findAll();
    }
}
