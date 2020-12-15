package com.PcPartPicker.BackEnd.GraphicCards;


import org.springframework.stereotype.Controller;

@Controller
public class GpuController {

    private final GpuRepository gpuRepository;

    public GpuController(GpuRepository gpuRepository)
    {
        this.gpuRepository = gpuRepository;
    }


}
