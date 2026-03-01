package com.example.demo.controller;

import com.example.demo.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PostCreateController {

    private final PostService postService;

    public PostCreateController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/new")
    public String create() {
        return "create";
    }

    @PostMapping("/new")
    public String doCreate(@ModelAttribute("text") String text) {
        postService.create(text);
        return "redirect:/";
    }
}