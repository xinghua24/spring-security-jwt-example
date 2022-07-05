package com.example.springsecurityjwtexample.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
  public long id;
  public String title;
  public String content;
}
