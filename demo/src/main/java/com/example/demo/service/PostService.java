package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    public List <Post> listAllPosts(){
        return Arrays.asList(
                new Post("Первый пост о backend"),
                new Post("Второй пост о frontend"),
                new Post("Третий пост о БД")
        );
    }
}
