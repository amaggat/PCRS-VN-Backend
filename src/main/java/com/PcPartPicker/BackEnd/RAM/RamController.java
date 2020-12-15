package com.PcPartPicker.BackEnd.RAM;

import com.PcPartPicker.BackEnd.RAM.RamRepository;
import org.springframework.stereotype.Controller;

@Controller
public class RamController {

    private final RamRepository ramRepository;

    public RamController(RamRepository ramRepository) {
        this.ramRepository = ramRepository;
    }
}
