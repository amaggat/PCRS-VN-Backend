package com.PcPartPicker.BackEnd.GraphicCards;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GpuController {

    private final GpuRepository gpuRepository;

    public GpuController(GpuRepository gpuRepository)
    {
        this.gpuRepository = gpuRepository;
    }


}
