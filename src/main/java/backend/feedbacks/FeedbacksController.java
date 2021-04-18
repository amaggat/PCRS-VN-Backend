package backend.feedbacks;


import backend.article.PostRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbacksController {

    private final FeedbacksRepository feedbacksRepository;

    private final PostRepository postRepository;

    public FeedbacksController(FeedbacksRepository feedbacksRepository, PostRepository postRepository) {
        this.feedbacksRepository = feedbacksRepository;
        this.postRepository = postRepository;
    }

    @PostMapping(path = "/api/feedbacks")
    public ResponseEntity addFeedback(@RequestBody Feedbacks feedbacks) {
        feedbacksRepository.save(feedbacks);
        return new ResponseEntity(HttpStatus.OK);
    }
}
