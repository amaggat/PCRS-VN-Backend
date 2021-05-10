package backend.pc.mainboard;

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
                                @RequestParam(name = "formfactor", required = false) String formfactor,
                                Pageable pageable) {
        Page<Mainboard> mainboard = mainRepository.findAll((Specification<Mainboard>) (root, criteriaQuery, criteriaBuilder) -> {
            Predicate predicate = criteriaBuilder.conjunction();
            if (Objects.nonNull(chipset)) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.like(root.get("chipset"), "%" + chipset + "%"));
            }
            if (Objects.nonNull(manufacturer)) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.like(root.get("manufacturer"), "%" + manufacturer + "%"));
            }
            if (Objects.nonNull(socket)) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.like(root.get("socket"), "%" + socket + "%"));
            }
            if (Objects.nonNull(sizeofram)) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.like(root.get("sizeofram"), "%" + sizeofram + "%"));
            }
            if (Objects.nonNull(memorySlot)) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("memory_slot"), memorySlot));
            }
            if (Objects.nonNull(formfactor)) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("formfactor"), formfactor));
            }
            if (!StringUtils.isEmpty(name)) {
                predicate = criteriaBuilder.and(predicate, criteriaBuilder.like(root.get("fullname"), "%" + name + "%"));
            }
            criteriaQuery.orderBy(criteriaBuilder.desc(root.get("fullname")), criteriaBuilder.asc(root.get("id")));
            return predicate;
        }, pageable);
        return mainboard;
    }

    @GetMapping("/api/mainboard/{id}")
    public Mainboard SearchByID(@PathVariable("id") String id) {
        mainRepository.update(id);
        return mainRepository.findByID(id);
    }

}
