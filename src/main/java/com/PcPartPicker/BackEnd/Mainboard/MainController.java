package com.PcPartPicker.BackEnd.Mainboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final MainRepository mainRepository;

    public MainController(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    @GetMapping("/api/mainboard")
    public List<Mainboard> list(){
        return mainRepository.findAll();
    }

    @GetMapping("/api/mainboard/{id}")
    public Mainboard SearchByID(@PathVariable("id") String id){
        return mainRepository.findByID(id);
    }
}
