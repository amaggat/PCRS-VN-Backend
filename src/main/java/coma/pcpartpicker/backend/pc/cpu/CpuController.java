package coma.pcpartpicker.backend.pc.cpu;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import javax.persistence.criteria.Predicate;

@RestController
public class CpuController {

    private final CpuRepository cpuRepository;

    public CpuController(CpuRepository cpuRepository) {
        this.cpuRepository = cpuRepository;

    }

    @GetMapping("/api/cpu")
    public Page<cpu> list(@RequestParam(name = "name", required = false) String name,
                          @RequestParam(name = "chipset", required = false) String chipset,
                          @RequestParam(name = "manufacturer", required = false) String manufacturer,
                          @RequestParam(name = "socket", required = false) String socket,
                          @RequestParam(name = "cores", required = false) Integer cores,
                          Pageable pageable
                          ){
        Page<cpu> cpu = cpuRepository.findAll((Specification<cpu>) (root, cq, cb) -> {
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
            if (Objects.nonNull(cores) ) {
                p = cb.and(p, cb.equal(root.get("cores"), cores));
            }
            if (!StringUtils.isEmpty(name)) {
                p = cb.and(p, cb.like(root.get("fullname"), "%" + name + "%"));
            }
            cq.orderBy(cb.desc(root.get("fullname")), cb.asc(root.get("id")));
            return p;
        }, pageable);
        return cpu;
    }

    @GetMapping("/api/cpu/{CpuID}")
    public cpu SearchById(@PathVariable("CpuID") String id)
    {
        return cpuRepository.findByID(id);
    }

}
