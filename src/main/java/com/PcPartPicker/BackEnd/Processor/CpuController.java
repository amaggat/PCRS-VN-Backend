package com.PcPartPicker.BackEnd.Processor;

import org.springframework.stereotype.Controller;


@Controller
public class CpuController {

    private final CpuRepository cpuRepository;

    public CpuController(CpuRepository cpuRepository) {
        this.cpuRepository = cpuRepository;
    }
}
