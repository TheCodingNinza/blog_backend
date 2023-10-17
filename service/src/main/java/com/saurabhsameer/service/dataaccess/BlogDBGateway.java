package com.saurabhsameer.service.dataaccess;

import com.saurabhsameer.service.model.Blog;

import java.util.List;

public interface BlogDBGateway {

  List<Blog> getBlogsByAuthor(String authorId);

  Blog getBlogById(String blogId);

  Blog createBlog(Blog blog);

  void deleteBlogById(String blogId);

  Blog updateBlog(Blog blog);

}
