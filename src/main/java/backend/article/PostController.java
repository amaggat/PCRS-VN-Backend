package backend.article;


import backend.feedbacks.Feedbacks;
import backend.feedbacks.FeedbacksRepository;
import backend.security.model.AuthenticationResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.Predicate;
import java.util.List;
import java.util.Objects;

@RestController
public class PostController {


    private final PostRepository postRepository;

    private final FeedbacksRepository feedbacksRepository;

    public PostController(PostRepository postRepository, FeedbacksRepository feedbacksRepository) {
        this.postRepository = postRepository;
        this.feedbacksRepository = feedbacksRepository;
    }

    @GetMapping("/api/post")
    public Page<Post> list(Pageable pageable,
                           @RequestParam(name = "type", required = false) String type) {
        Page<Post> post = postRepository.findAll((Specification<Post>) (root, cq, cb) -> {
            Predicate p = cb.conjunction();
            cq.orderBy(cb.desc(root.get("name")), cb.asc(root.get("id")));
            if (Objects.nonNull(type)) {
                p = cb.and(p, cb.like(root.get("type"), "%" + type + "%"));
            }
            return p;
        }, pageable);
        return post;
    }

    @GetMapping("/api/post/{PostID}/feedbacks")
    public List<Feedbacks> listFeedbacks(@PathVariable("PostID") Integer id) {
        List<Feedbacks> feedbacks = feedbacksRepository.findByPostID(id);
        return feedbacks;
    }

    @GetMapping("/api/post/{PostID}")
    public Post SearchById(@PathVariable("PostID") Integer id) {
        postRepository.update(id);
        return postRepository.findByID(id);
    }

    @PostMapping("user/addPost")
    public ResponseEntity<?> addPost(@RequestBody Post post, @CookieValue(value = "username", required = true) String username) {
        postRepository.save(post);
        return ResponseEntity.ok(new AuthenticationResponse("Rated", username));
    }
}
