package com.example.demo.controller;

import com.example.demo.entity.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  @GetMapping("/posts/1")
  public Post getPosts() {
    return Post.builder().id(1)
        .title("Post Title...")
        .content("Post Content...")
        .build();
  }
}
