package com.PcPartPicker.BackEnd._UserRelate.Article;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.Predicate;

@RestController
public class PostController {


    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/api/post")
    public Page<Post> list(Pageable pageable)
    {
        Page<Post> post = postRepository.findAll((Specification<Post>) (root, cq, cb) -> {
            Predicate p = cb.conjunction();
            cq.orderBy(cb.desc(root.get("name")), cb.asc(root.get("id")));
            return p;
        }, pageable);
        return post;
    }

    @GetMapping("/api/post/{PostID}")
    public Post SearchById(@PathVariable("PostID") Integer id)
    {
        return postRepository.findByID(id);
    }

}
