package com.example.demo.controller;

import com.example.demo.entity.Post;
import com.example.demo.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

  @GetMapping("")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public String getPosts() {
    return "Admin Message...";
  }
}
