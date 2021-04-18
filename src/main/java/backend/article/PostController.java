package backend.article;


import backend.feedbacks.Feedbacks;
import backend.feedbacks.FeedbacksRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.Predicate;
import java.util.List;

@RestController
public class PostController {


    private final PostRepository postRepository;

    private final FeedbacksRepository feedbacksRepository;

    public PostController(PostRepository postRepository, FeedbacksRepository feedbacksRepository) {
        this.postRepository = postRepository;
        this.feedbacksRepository = feedbacksRepository;
    }

    @GetMapping("/api/post")
    public Page<Post> list(Pageable pageable) {
        Page<Post> post = postRepository.findAll((Specification<Post>) (root, cq, cb) -> {
            Predicate p = cb.conjunction();
            cq.orderBy(cb.desc(root.get("name")), cb.asc(root.get("id")));
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
        return postRepository.findByID(id);
    }

}
