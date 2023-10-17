package com.saurabhsameer.dataaccess.dbgateway;

import com.saurabhsameer.service.dataaccess.BlogDBGateway;
import com.saurabhsameer.service.model.Blog;

import java.util.List;

public class BlogDBGatewayImpl implements BlogDBGateway {

  @Override
  public List<Blog> getBlogsByAuthor(String authorId) {
    return null;
  }

  @Override
  public Blog getBlogById(String blogId) {
    return null;
  }

  @Override
  public Blog createBlog(Blog blog) {
    return null;
  }

  @Override
  public void deleteBlogById(String blogId) {

  }

  @Override
  public Blog updateBlog(Blog blog) {
    return null;
  }
}
