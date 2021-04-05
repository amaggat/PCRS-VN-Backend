package com.pcpartpicker.backend.pc.component.psu;


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
public class PsuController {
    private final PsuRepository psuRepository;

    public PsuController(PsuRepository psuRepository) {
        this.psuRepository = psuRepository;
    }

    @GetMapping("/api/psu")
    public Page<PowerSupplyUnit> list(@RequestParam(name = "name", required = false) String name,
                                      @RequestParam(name = "chipset", required = false) String chipset,
                                      @RequestParam(name = "manufacturer", required = false) String manufacturer,
                                      @RequestParam(name = "standard_80", required = false) String standard_80,
                                      Pageable pageable){
        Page<PowerSupplyUnit> psu= psuRepository.findAll((Specification<PowerSupplyUnit>) (root, cq, cb) -> {
            Predicate p = cb.conjunction();
            if (Objects.nonNull(chipset) ) {
                p = cb.and(p, cb.like(root.get("chipset"), "%" + chipset + "%"));
            }
            if (Objects.nonNull(manufacturer) ) {
                p = cb.and(p, cb.like(root.get("manufacturer"), "%" +manufacturer+ "%"));
            }
            if (Objects.nonNull(standard_80) ) {
                p = cb.and(p, cb.like(root.get("standard_80"), "%" + standard_80+ "%"));
            }
            if (!StringUtils.isEmpty(name)) {
                p = cb.and(p, cb.like(root.get("fullname"), "%" + name + "%"));
            }
            cq.orderBy(cb.desc(root.get("fullname")), cb.asc(root.get("id")));
            return p;
        }, pageable);
        return psu;
    }

    @GetMapping("/api/psu/{id}")
    public PowerSupplyUnit SearchById(@PathVariable("id") String id)
    {
        return psuRepository.findByID(id);
    }

}
