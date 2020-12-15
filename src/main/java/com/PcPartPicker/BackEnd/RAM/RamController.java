package com.PcPartPicker.BackEnd.RAM;


import com.PcPartPicker.BackEnd._Model.PcProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RamController {

    private final RamRepository ramRepository;

    public RamController(RamRepository ramRepository) {
        this.ramRepository = ramRepository;
    }

    @GetMapping("/rams")
    public List<ram> list(){
        return ramRepository.findAll();
    }
}
