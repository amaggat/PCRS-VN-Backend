package com.PcPartPicker.BackEnd.RAM;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class RamController {

    private final RamRepository ramRepository;

    public RamController(RamRepository ramRepository) {
        this.ramRepository = ramRepository;
    }
}
