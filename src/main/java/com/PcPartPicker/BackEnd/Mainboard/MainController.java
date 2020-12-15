package com.PcPartPicker.BackEnd.Mainboard;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final MainRepository mainRepository;

    public MainController(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }
}
