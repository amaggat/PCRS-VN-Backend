package backend.pcprofile;


import backend.security.model.AuthenticationResponse;
import backend.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Page<PcProfile> list(@RequestParam(name = "name", required = false) String name,
                                @RequestParam(name = "type", required = false) String type,
                                @RequestParam(name = "id", required = false) Integer id,
                                Pageable pageable) {

        Page<PcProfile> pcProfiles = pcProfileRepository.findAll((Specification<PcProfile>) (root, cq, cb) -> {
            Predicate p = cb.conjunction();
            if (Objects.nonNull(name)) {
                p = cb.and(p, cb.like(root.get("name"), "%" + name + "%"));
            }
            if (Objects.nonNull(type)) {
                p = cb.and(p, cb.like(root.get("type"), "%" + type + "%"));
            }
            if (Objects.nonNull(type)) {
                p = cb.and(p, cb.equal(root.get("userid"), id));
            }
            cq.orderBy(cb.desc(root.get("name")), cb.asc(root.get("id")));
            return p;
        }, pageable);
        return pcProfiles;
    }

    @GetMapping("/api/pcprofile/{PcID}")
    public PcProfile findByID(@PathVariable("PcID") String id) {
        return pcProfileRepository.findByID(id);
    }

    @GetMapping("/api/user/{UserID}/pcprofile")
    public PcProfile findByUserID(@PathVariable("UserID") Integer id) {
        return pcProfileRepository.findByUserID(id);
    }

    @PostMapping("user/addPc")
    public ResponseEntity<?> addNewPcProfile(@RequestBody PcProfile pcProfile) {
        pcProfile.setId(pcProfile.getUser().getKey() + "-" + pcProfile.getName());
        pcProfileRepository.save(pcProfile);
        return ResponseEntity.ok(new AuthenticationResponse("Added", pcProfile.getUser().getValue()));
    }
}
