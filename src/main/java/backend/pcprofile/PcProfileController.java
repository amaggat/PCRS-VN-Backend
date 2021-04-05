package backend.pcprofile;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.Predicate;
import java.util.Objects;

@RestController
public class PcProfileController {

    private final PcProfileRepository pcProfileRepository;

    public PcProfileController(PcProfileRepository pcProfileRepository) {
        this.pcProfileRepository = pcProfileRepository;
    }

    @GetMapping("/api/pcprofile")
    public Page<PcProfile> list(@RequestParam(name = "name", required = false) String name, Pageable pageable){

        Page<PcProfile> pcProfiles = pcProfileRepository.findAll((Specification<PcProfile>) (root, cq, cb) -> {
            Predicate p = cb.conjunction();
            if (Objects.nonNull(name) ) {
                p = cb.and(p, cb.like(root.get("pcname"), "%" + name+ "%"));
            }
            cq.orderBy(cb.desc(root.get("pcname")), cb.asc(root.get("id")));
            return p;
        }, pageable);
        return pcProfiles;

    }


    @GetMapping("/api/pcProfiles/{PcID}")
    public PcProfile findByID(@PathVariable("PcID") String id){
        return pcProfileRepository.findByID(id);
    }
}
