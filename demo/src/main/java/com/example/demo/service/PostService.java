package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    private final List<Post> posts;
    {
        posts = new ArrayList<>();
        posts.add(new Post("Первый пост о backend"));
        posts.add(new Post("Второй пост о frontend"));
        posts.add(new Post("Третий пост о БД"));
    }
    public List <Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text));
    }
}
