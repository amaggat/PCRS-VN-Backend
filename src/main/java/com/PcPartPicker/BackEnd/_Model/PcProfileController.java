package com.PcPartPicker.BackEnd._Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PcProfileController {

    private final PcProfileRepository pcProfileRepository;

    public PcProfileController(PcProfileRepository pcProfileRepository) {
        this.pcProfileRepository = pcProfileRepository;
    }

    @GetMapping("/api/pcProfiles")
    public List<PcProfile> list(){
        return pcProfileRepository.findAll();
    }

    @GetMapping("/api/pcProfiles/name={PcName}")
    public List<PcProfile> findByName(@PathVariable("PcName") String name){
        return pcProfileRepository.findByName(name);
    }

    @GetMapping("/api/pcProfiles/{PcID}")
    public PcProfile findByID(@PathVariable("PcID") String id){
        return pcProfileRepository.findByID(id);
    }
}
