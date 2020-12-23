package com.PcPartPicker.BackEnd.PSU;


import com.PcPartPicker.BackEnd.RAM.ram;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PsuController {
    private final PsuRepository psuRepository;

    public PsuController(PsuRepository psuRepository) {
        this.psuRepository = psuRepository;
    }

    @GetMapping("/api/psu")
    public List<PowerSupplyUnit> list(){
        return psuRepository.findAll();
    }

    @GetMapping("/api/psu/find/size={PsuPowerMin}-{PsuPowerMax}")
    public List<PowerSupplyUnit> SearchByPower(@PathVariable("PsuPowerMin") int min_power, @PathVariable("PsuPowerMax") int max_power)
    {
        return psuRepository.findByPower(min_power, max_power);
    }

    @GetMapping("/api/psu/find/name={PsuStandard}")
    public List<PowerSupplyUnit> SearchByName(@PathVariable("PsuStandard") String Standard)
    {
        return psuRepository.findByName(Standard);
    }

    @GetMapping("/api/psu/find/manufacturer={PsuStandard}")
    public List<PowerSupplyUnit> SearchByManufacturer(@PathVariable("PsuStandard") String Manufacturer)
    {
        return psuRepository.findByManufacturer(Manufacturer);
    }

    @GetMapping("/api/psu/{id}")
    public PowerSupplyUnit SearchById(@PathVariable("id") String id)
    {
        return psuRepository.findByID(id);
    }

}
