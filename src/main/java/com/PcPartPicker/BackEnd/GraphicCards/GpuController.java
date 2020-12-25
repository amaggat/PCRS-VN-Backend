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

    @GetMapping("/api/gpu/find/name={GpuName}")
    public List<gpu> SearchByName(@PathVariable("GpuName") String name)
    {
        return gpuRepository.findByName(name);
    }

    @GetMapping("/api/gpu/find/manufacturer={GpuManufacturer}")
    public List<gpu> SearchByManufacturer(@PathVariable("GpuManufacturer") String name)
    {
        return gpuRepository.findByManufacturer(name);
    }

    @GetMapping("/api/gpu/find/vram={GpuVRAM}")
    public List<gpu> SearchByVram(@PathVariable("GpuVRAM") int vram)
    {
        return gpuRepository.findByVRam(vram);
    }

    @GetMapping("/api/gpu/find/chipset={GpuChipset}")
    public List<gpu> SearchByChipset(@PathVariable("GpuChipset") String chipset)
    {
        return gpuRepository.findByChipset(chipset);
    }
}
