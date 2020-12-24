package com.PcPartPicker.BackEnd.Drives.HardDriveDisk;

import com.PcPartPicker.BackEnd.Drives.SolidStateDrive.SsdRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HddController {
    private final HddRepository hddRepository;

    public HddController(HddRepository hddRepository)
    {
        this.hddRepository = hddRepository;
    }

    @GetMapping("/api/hdd")
    public List<HardDiskDrive> list(){
        return hddRepository.findAll();
    }
}
