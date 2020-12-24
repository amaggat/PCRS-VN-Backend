package com.PcPartPicker.BackEnd.RAM;


import com.PcPartPicker.BackEnd.Processor.cpu;
import com.PcPartPicker.BackEnd._Model.PcProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RamController {

    private final RamRepository ramRepository;

    public RamController(RamRepository ramRepository) {
        this.ramRepository = ramRepository;
    }

    @GetMapping("/api/ram")
    public List<ram> list(){
        return ramRepository.findAll();
    }

    @GetMapping("/api/ram/{RamID}")
    public ram SearchByID(@PathVariable("RamID") String id){
        return ramRepository.findByID(id);
    }

    @GetMapping("/api/ram/find/name={RamName}")
    public List<ram> SearchByName(@PathVariable("RamName") String name)
    {
        return ramRepository.findByName(name);
    }

    @GetMapping("/api/ram/find/size={RamSize}")
    public List<ram> SearchBySize(@PathVariable("RamSize") String size)
    {
        return ramRepository.findBySize(size);
    }

    @GetMapping("/api/ram/find/size={RamClock}")
    public List<ram> SearchByClockSpeed(@PathVariable("RamClock") int clockSpeed)
    {
        return ramRepository.findByClockSpeed(clockSpeed);
    }

    @GetMapping("/api/ram/find/size={RamManu}")
    public List<ram> SearchByManufacturer(@PathVariable("RamManu") String manufacturer)
    {
        return ramRepository.findByManufacturer(manufacturer);
    }
}
