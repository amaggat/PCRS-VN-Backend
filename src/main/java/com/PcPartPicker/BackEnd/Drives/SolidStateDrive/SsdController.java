package com.PcPartPicker.BackEnd.Drives.SolidStateDrive;

import com.PcPartPicker.BackEnd.Drives.HardDriveDisk.HardDiskDrive;
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

    @GetMapping("/api/ssd/find/name={SsdName}")
    public List<SolidStateDrive> SearchByName(@PathVariable("SsdName") String name){
        return ssdRepository.findByName(name);
    }

    @GetMapping("/api/ssd/find/size={SsdSize}")
    public List<SolidStateDrive> SearchBySize(@PathVariable("SsdSize") String size){
        return ssdRepository.findBySize(size);
    }

    @GetMapping("/api/ssd/find/manufacturer={SsdManufacturer}")
    public List<SolidStateDrive> SearchByManufacturer(@PathVariable("SsdManufacturer") String manufacturer){
        return ssdRepository.findByManufacturer(manufacturer);
    }
}
