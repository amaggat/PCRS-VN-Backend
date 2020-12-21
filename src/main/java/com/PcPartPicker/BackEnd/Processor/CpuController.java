package com.PcPartPicker.BackEnd.Processor;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/cpus/search")
    public List<cpu> SearchByName(@RequestParam(value = "name", defaultValue = "") String name)
    {
        return cpuRepository.findByName(name);
    }
}
