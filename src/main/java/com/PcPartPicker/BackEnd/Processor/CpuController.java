package com.PcPartPicker.BackEnd.Processor;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CpuController {

    private final CpuRepository cpuRepository;

    public CpuController(CpuRepository cpuRepository) {
        this.cpuRepository = cpuRepository;
    }
}
