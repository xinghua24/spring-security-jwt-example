package com.example.springsecurityjwtexample.controller;

import com.example.springsecurityjwtexample.service.JwtUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
  private final AuthenticationManager authenticationManager;
  private final JwtUtils jwtUtils;

  public AuthController(AuthenticationManager authenticationManager,
      JwtUtils jwtUtils) {
    this.authenticationManager = authenticationManager;
    this.jwtUtils = jwtUtils;
  }

  @PostMapping("/signin")
  public ResponseEntity<String> signin(@RequestBody SigninRequest signinRequest) {
    UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(signinRequest.getUsername(), signinRequest.getPassword());
    try {
      Authentication authentication = authenticationManager.authenticate(token);
      if(authentication != null ) {
        return ResponseEntity.ok(jwtUtils.generate(signinRequest.getUsername(), authentication.getAuthorities()));
      }
    } catch (AuthenticationException e) {
      ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
  }
}
