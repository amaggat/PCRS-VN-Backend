package com.PcPartPicker.BackEnd.Mainboard;

import com.PcPartPicker.BackEnd.Processor.CpuRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final MainRepository mainRepository;

    public MainController(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    @GetMapping("/mainboards")
    public List<Mainboard> list(){
        return mainRepository.findAll();
    }
}
