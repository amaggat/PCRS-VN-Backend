package backend.retailer;

import backend.pc.ram.Ram;
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
public class RetailerController {

    RetailerRepository retailerRepository;

    public RetailerController(RetailerRepository retailerRepository) {
        this.retailerRepository = retailerRepository;
    }

    @GetMapping("/api/retailer")
    public Page<Retailer> list(@RequestParam(name = "name", required = false) String name,
                               Pageable pageable) {
        Page<Retailer> retailers = retailerRepository.findAll((Specification<Retailer>) (root, cq, cb) -> {
            Predicate p = cb.conjunction();
            if (!StringUtils.isEmpty(name)) {
                p = cb.and(p, cb.like(root.get("name"), "%" + name + "%"));
            }
            cq.orderBy(cb.desc(root.get("name")), cb.asc(root.get("id")));
            return p;
        }, pageable);

        return retailers;
    }

    @GetMapping("/api/retailer/{id}")
    public Retailer findByID(@PathVariable("id") Integer id) {
        return retailerRepository.findByID(id);
    }
}
