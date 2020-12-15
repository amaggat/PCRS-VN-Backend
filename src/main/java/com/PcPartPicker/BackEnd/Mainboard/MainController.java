package com.PcPartPicker.BackEnd.Mainboard;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    private final MainRepository mainRepository;

    public MainController(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }
}
