package com.PcPartPicker.BackEnd.Drives.HardDriveDisk;

import com.PcPartPicker.BackEnd.Drives.SolidStateDrive.SsdRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/api/hdd/{id}")
    public HardDiskDrive SearchByID(@PathVariable("id") String id){
        return hddRepository.findByID(id);
    }

    @GetMapping("/api/hdd/find/name={HddName}")
    public List<HardDiskDrive> SearchByName(@PathVariable("HddName") String name){
        return hddRepository.findByName(name);
    }

    @GetMapping("/api/hdd/find/size={HddSize}")
    public List<HardDiskDrive> SearchBySize(@PathVariable("HddSize") String size){
        return hddRepository.findBySize(size);
    }

    @GetMapping("/api/hdd/find/manufacturer={HddManufacturer}")
    public List<HardDiskDrive> SearchByManufacturer(@PathVariable("HddManufacturer")String manufacturer){
        return hddRepository.findByManufacturer(manufacturer);
    }
}
