package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikesService {
    @Autowired
    private PostService postService;

    public int like(Long postId) {
        Post post = postService.getPostById(postId);
        if (post != null) {
            post.setLikes(post.getLikes() + 1);
            postService.updatePost(post);
            return post.getLikes();
        }
        return 0;
    }
}
