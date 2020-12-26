package com.PcPartPicker.BackEnd.Drives.SolidStateDrive;

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
public class SsdController {

    private final SsdRepository ssdRepository;

    public SsdController(SsdRepository ssdRepository)
    {
        this.ssdRepository = ssdRepository;
    }

    @GetMapping("/api/ssd")
    public Page<SolidStateDrive> list(@RequestParam(name = "name", required = false) String name,
                                      @RequestParam(name = "chipset", required = false) String chipset,
                                      @RequestParam(name = "manufacturer", required = false) String manufacturer,
                                      @RequestParam(name = "storage", required = false) String storage,
                                      Pageable pageable){
        Page<SolidStateDrive> ssd = ssdRepository.findAll((Specification<SolidStateDrive>) (root, cq, cb) -> {
            Predicate p = cb.conjunction();
            if (Objects.nonNull(chipset) ) {
                p = cb.and(p, cb.like(root.get("chipset"), "%" + chipset + "%"));
            }
            if (Objects.nonNull(manufacturer) ) {
                p = cb.and(p, cb.like(root.get("manufacturer"), "%" +manufacturer+ "%"));
            }
            if (Objects.nonNull(storage) ) {
                p = cb.and(p, cb.like(root.get("storage"), "%" + storage+ "%"));
            }
            if (!StringUtils.isEmpty(name)) {
                p = cb.and(p, cb.like(root.get("fullname"), "%" + name + "%"));
            }
            cq.orderBy(cb.desc(root.get("fullname")), cb.asc(root.get("id")));
            return p;
        }, pageable);
        return ssd;
    }

    @GetMapping("/api/ssd/{id}")
    public SolidStateDrive SearchById(@PathVariable("id") String id){
        return ssdRepository.findByID(id);
    }

    @GetMapping("/api/ssd/find/name={SsdName}")
    public List<SolidStateDrive> SearchByName(@PathVariable("SsdName") String name){
        return ssdRepository.findByName(name);
    }

    @GetMapping("/api/ssd/find/size={SsdSize}")
    public List<SolidStateDrive> SearchBySize(@PathVariable("SsdSize") String size){
        return ssdRepository.findBySize(size);
    }

    @GetMapping("/api/ssd/find/manufacturer={SsdManufacturer}")
    public List<SolidStateDrive> SearchByManufacturer(@PathVariable("SsdManufacturer") String manufacturer){
        return ssdRepository.findByManufacturer(manufacturer);
    }
}
