package com.PcPartPicker.BackEnd.Processor;

import com.PcPartPicker.BackEnd.PSU.PsuRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CpuController {

    private final CpuRepository cpuRepository;

    public CpuController(CpuRepository cpuRepository) {
        this.cpuRepository = cpuRepository;
    }

    @GetMapping("/cpus")
    public List<cpu> list(){
        return cpuRepository.findAll();
    }
}
