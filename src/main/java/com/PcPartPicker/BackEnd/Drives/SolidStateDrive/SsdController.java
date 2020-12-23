package com.PcPartPicker.BackEnd.Drives.SolidStateDrive;

import com.PcPartPicker.BackEnd.GraphicCards.GpuRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SsdController {

    private final SsdRepository ssdRepository;

    public SsdController(SsdRepository ssdRepository)
    {
        this.ssdRepository = ssdRepository;
    }

//    @GetMapping("/solidStateDrives")
//    public List<SolidStateDrive> list(){
//        return ssdRepository.findAll();
//    }
}
