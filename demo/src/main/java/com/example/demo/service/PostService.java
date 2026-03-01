package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    private final List<Post> posts;
    {
        posts = new ArrayList<>();
    }
    public List <Post> listAllPosts(){
        return (List<Post>) postRepository.findAll();
    }

    public void create(String text) {
        Post post = new Post(text);
        postRepository.save(post);

    }
}
