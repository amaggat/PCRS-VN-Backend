package com.PcPartPicker.BackEnd.Drives.HardDriveDisk;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.Predicate;
import java.util.Objects;

@RestController
public class HddController {
    private final HddRepository hddRepository;

    public HddController(HddRepository hddRepository)
    {
        this.hddRepository = hddRepository;
    }

    @GetMapping("/api/hdd")
    public Page<HardDiskDrive> list(@RequestParam(name = "name", required = false) String name,
                                    @RequestParam(name = "chipset", required = false) String chipset,
                                    @RequestParam(name = "manufacturer", required = false) String manufacturer,
                                    @RequestParam(name = "storage", required = false) String size,
                                    Pageable pageable){
        Page<HardDiskDrive> hdd = hddRepository.findAll((Specification<HardDiskDrive>) (root, cq, cb) -> {
            Predicate p = cb.conjunction();
            if (Objects.nonNull(chipset) ) {
                p = cb.and(p, cb.like(root.get("chipset"), "%" + chipset + "%"));
            }
            if (Objects.nonNull(manufacturer) ) {
                p = cb.and(p, cb.like(root.get("manufacturer"), "%" +manufacturer+ "%"));
            }
            if (Objects.nonNull(size) ) {
                p = cb.and(p, cb.like(root.get("storage"), "%" + size+ "%"));
            }
            if (!StringUtils.isEmpty(name)) {
                p = cb.and(p, cb.like(root.get("fullname"), "%" + name + "%"));
            }
            cq.orderBy(cb.desc(root.get("fullname")), cb.asc(root.get("id")));
            return p;
        }, pageable);
        return hdd;
    }

    @GetMapping("/api/hdd/{id}")
    public HardDiskDrive SearchByID(@PathVariable("id") String id){
        return hddRepository.findByID(id);
    }

//    @GetMapping("/api/hdd/find/name={HddName}")
//    public List<HardDiskDrive> SearchByName(@PathVariable("HddName") String name){
//        return hddRepository.findByName(name);
//    }
//
//    @GetMapping("/api/hdd/find/size={HddSize}")
//    public List<HardDiskDrive> SearchBySize(@PathVariable("HddSize") String size){
//        return hddRepository.findBySize(size);
//    }
//
//    @GetMapping("/api/hdd/find/manufacturer={HddManufacturer}")
//    public List<HardDiskDrive> SearchByManufacturer(@PathVariable("HddManufacturer")String manufacturer){
//        return hddRepository.findByManufacturer(manufacturer);
//    }
}
