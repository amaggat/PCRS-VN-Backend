package com.PcPartPicker.BackEnd.RAM;


import com.PcPartPicker.BackEnd.PSU.PowerSupplyUnit;
import com.PcPartPicker.BackEnd.Processor.cpu;
import com.PcPartPicker.BackEnd._Model.PcProfile;
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
public class RamController {

    private final RamRepository ramRepository;

    public RamController(RamRepository ramRepository) {
        this.ramRepository = ramRepository;
    }

    @GetMapping("/api/ram")
    public Page<ram> list(@RequestParam(name = "name", required = false) String name,
                          @RequestParam(name = "chipset", required = false) String chipset,
                          @RequestParam(name = "manufacturer", required = false) String manufacturer,
                          @RequestParam(name = "sizeOfRam", required = false) String sizeOfRam,
                          @RequestParam(name = "clockSpeed", required = false) Integer clockSpeed,
                          Pageable pageable){
        Page<ram> ramPage = ramRepository.findAll((Specification<ram>) (root, cq, cb) -> {
            Predicate p = cb.conjunction();
            if (Objects.nonNull(chipset) ) {
                p = cb.and(p, cb.like(root.get("chipset"), "%" + chipset + "%"));
            }
            if (Objects.nonNull(manufacturer) ) {
                p = cb.and(p, cb.like(root.get("manufacturer"), "%" +manufacturer+ "%"));
            }
            if (Objects.nonNull(sizeOfRam) ) {
                p = cb.and(p, cb.like(root.get("sizeOfRam"), "%" + sizeOfRam+ "%"));
            }
            if (Objects.nonNull(clockSpeed) ) {
                p = cb.and(p, cb.equal(root.get("clockSpeed"),clockSpeed));
            }
            if (!StringUtils.isEmpty(name)) {
                p = cb.and(p, cb.like(root.get("fullname"), "%" + name + "%"));
            }
            cq.orderBy(cb.desc(root.get("fullname")), cb.asc(root.get("id")));
            return p;
        }, pageable);

//        List<ram> ram = ramRepository.findAll((Specification<ram>) (root, cq, cb) -> {
//            Predicate p = cb.conjunction();
//            if (Objects.nonNull(chipset) ) {
//                p = cb.and(p, cb.like(root.get("chipset"), "%" + chipset + "%"));
//            }
//            if (Objects.nonNull(manufacturer) ) {
//                p = cb.and(p, cb.like(root.get("manufacturer"), "%" +manufacturer+ "%"));
//            }
//            if (Objects.nonNull(sizeOfRam) ) {
//                p = cb.and(p, cb.like(root.get("sizeOfRam"), "%" + sizeOfRam+ "%"));
//            }
//            if (!StringUtils.isEmpty(name)) {
//                p = cb.and(p, cb.like(root.get("fullname"), "%" + name + "%"));
//            }
//            cq.orderBy(cb.desc(root.get("fullname")), cb.asc(root.get("id")));
//            return p;
//        }, pageable).getContent();
//
//        List<ram> ram = ramPage.getContent();
//        int totalPage = ramPage.getTotalPages();
//        long totalElements = ramPage.getTotalElements();
//
//        System.out.println(totalPage);
        return ramPage;
    }

    @GetMapping("/api/ram/{RamID}")
    public ram SearchByID(@PathVariable("RamID") String id){
        return ramRepository.findByID(id);
    }

//    @GetMapping("/api/ram/find/name={RamName}")
//    public List<ram> SearchByName(@PathVariable("RamName") String name)
//    {
//        return ramRepository.findByName(name);
//    }
//
//    @GetMapping("/api/ram/find/size={RamSize}")
//    public List<ram> SearchBySize(@PathVariable("RamSize") String size)
//    {
//        return ramRepository.findBySize(size);
//    }
//
//    @GetMapping("/api/ram/find/size={RamClock}")
//    public List<ram> SearchByClockSpeed(@PathVariable("RamClock") int clockSpeed)
//    {
//        return ramRepository.findByClockSpeed(clockSpeed);
//    }
//
//    @GetMapping("/api/ram/find/size={RamManu}")
//    public List<ram> SearchByManufacturer(@PathVariable("RamManu") String manufacturer)
//    {
//        return ramRepository.findByManufacturer(manufacturer);
//    }
}
