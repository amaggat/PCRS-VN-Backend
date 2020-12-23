package com.PcPartPicker.BackEnd.GraphicCards;

import com.PcPartPicker.BackEnd.Mainboard.MainRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GpuController {

    private final GpuRepository gpuRepository;

    public GpuController(GpuRepository gpuRepository)
    {
        this.gpuRepository = gpuRepository;
    }

    @GetMapping("/gpus")
    public List<gpu> list(){
        return gpuRepository.findAll();
    }


}
