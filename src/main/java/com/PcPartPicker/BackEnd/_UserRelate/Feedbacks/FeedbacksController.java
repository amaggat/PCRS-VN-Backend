package com.PcPartPicker.BackEnd._UserRelate.Feedbacks;

import com.PcPartPicker.BackEnd._UserRelate.Article.Post;
import com.PcPartPicker.BackEnd._UserRelate.Article.PostRepository;
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

    @PostMapping(path="/api/feedbacks")
    public void addFeedback(@RequestBody Feedbacks feedbacks)
    {
//        Post one = postRepository.findByID(feedbacks.getPost());
//        Feedbacks newFeedbacks  = new Feedbacks();
//        newFeedbacks.setName(feedbacks.getName());
//        newFeedbacks.setPost(one);
        feedbacksRepository.save(feedbacks);
    }
}
