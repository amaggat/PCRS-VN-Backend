package com.PcPartPicker.BackEnd.Drives.SolidStateDrive;

import com.PcPartPicker.BackEnd.GraphicCards.GpuRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SsdController {

    private final SsdRepository ssdRepository;

    public SsdController(SsdRepository ssdRepository)
    {
        this.ssdRepository = ssdRepository;
    }

    @GetMapping("/api/ssd")
    public List<SolidStateDrive> list(){
        return ssdRepository.findAll();
    }

    @GetMapping("/api/ssd/{id}")
    public SolidStateDrive SearchById(@PathVariable("id") String id){
        return ssdRepository.findByID(id);
    }
}
