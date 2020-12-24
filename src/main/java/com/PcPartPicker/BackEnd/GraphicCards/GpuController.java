package com.PcPartPicker.BackEnd.GraphicCards;

import com.PcPartPicker.BackEnd.PSU.PowerSupplyUnit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GpuController {

    private final GpuRepository gpuRepository;

    public GpuController(GpuRepository gpuRepository)
    {
        this.gpuRepository = gpuRepository;
    }

    @GetMapping("/api/gpu")
    public List<gpu> list(){
        return gpuRepository.findAll();
    }

    @GetMapping("/api/gpu/{id}")
    public gpu SearchById(@PathVariable("id") String id)
    {
        return gpuRepository.findByID(id);
    }

}
