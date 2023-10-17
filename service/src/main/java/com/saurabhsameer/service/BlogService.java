package com.saurabhsameer.service;

import com.saurabhsameer.service.model.Blog;

import java.util.List;

public interface BlogService {

  List<Blog> getBlogsByAuthor(String authorId);

  Blog getBlogById(String blogId);

  Blog createBlog(Blog blog);

  void deleteBlogById(String blogId);

  Blog updateBlog(Blog blog);

}
