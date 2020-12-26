package com.PcPartPicker.BackEnd.Mainboard;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final MainRepository mainRepository;

    public MainController(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    @GetMapping("/api/mainboard")
    public List<Mainboard> list(@RequestParam(name = "name", required = false) String name,
                                @RequestParam(name = "chipset", required = false) String chipset,
                                @RequestParam(name = "socket", required = false) String socket,
                                @RequestParam(name = "manufacturer", required = false) String manufacturer,
                                Pageable pageable){
        List<Mainboard> mainboard = mainRepository.findAll();
        return mainboard;
    }

    @GetMapping("/api/mainboard/{id}")
    public Mainboard SearchByID(@PathVariable("id") String id){
        return mainRepository.findByID(id);
    }

//    @GetMapping("/api/mainboard/find/name={MainName}")
//    public List<Mainboard> SearchByName(@PathVariable("MainName") String name){
//        return mainRepository.findByName(name);
//    }
//
//    @GetMapping("/api/mainboard/find/socket={MainSocket}")
//    public List<Mainboard> SearchBySocket(@PathVariable("MainSocket") String socket){
//        return mainRepository.findBySocket(socket);
//    }
//
//    @GetMapping("/api/mainboard/find/manufacturer={MainManufacturer}")
//    public List<Mainboard> SearchByManufacturer(@PathVariable("MainManufacturer") String manufacturer){
//        return mainRepository.findByManufacturer(manufacturer);
//    }

}
