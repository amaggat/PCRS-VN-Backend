package com.PcPartPicker.BackEnd.Mainboard;

import com.PcPartPicker.BackEnd.Processor.cpu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.Predicate;
import java.util.List;
import java.util.Objects;

@RestController
public class MainController {

    private final MainRepository mainRepository;

    public MainController(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    @GetMapping("/api/mainboard")
    public Page<Mainboard> list(@RequestParam(name = "name", required = false) String name,
                                @RequestParam(name = "chipset", required = false) String chipset,
                                @RequestParam(name = "socket", required = false) String socket,
                                @RequestParam(name = "manufacturer", required = false) String manufacturer,
                                @RequestParam(name = "sizeofram", required = false) String sizeofram,
                                @RequestParam(name = "memory_slot", required = false) String memorySlot,
                                Pageable pageable){
        Page<Mainboard> mainboard = mainRepository.findAll((Specification<Mainboard>) (root, cq, cb) -> {
            Predicate p = cb.conjunction();
            if (Objects.nonNull(chipset) ) {
                p = cb.and(p, cb.like(root.get("chipset"), "%" + chipset + "%"));
            }
            if (Objects.nonNull(manufacturer) ) {
                p = cb.and(p, cb.like(root.get("manufacturer"), "%" +manufacturer+ "%"));
            }
            if (Objects.nonNull(socket) ) {
                p = cb.and(p, cb.like(root.get("socket"), "%" + socket+ "%"));
            }
            if (Objects.nonNull(sizeofram) ) {
                p = cb.and(p, cb.like(root.get("sizeofram"), "%" + sizeofram+ "%"));
            }
            if (Objects.nonNull(memorySlot) ) {
                p = cb.and(p, cb.equal(root.get("memory_slot"), memorySlot));
            }
            if (!StringUtils.isEmpty(name)) {
                p = cb.and(p, cb.like(root.get("fullname"), "%" + name + "%"));
            }
            cq.orderBy(cb.desc(root.get("fullname")), cb.asc(root.get("id")));
            return p;
        }, pageable);
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
