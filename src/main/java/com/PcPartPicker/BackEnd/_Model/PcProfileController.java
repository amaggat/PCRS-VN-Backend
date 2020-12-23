package com.PcPartPicker.BackEnd._Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PcProfileController {

    private final PcProfileRepository pcProfileRepository;

    public PcProfileController(PcProfileRepository pcProfileRepository) {
        this.pcProfileRepository = pcProfileRepository;
    }

//    @GetMapping("/pcProfiles")
//    public List<PcProfile> list(){
//        return pcProfileRepository.findAll();
//    }
}
