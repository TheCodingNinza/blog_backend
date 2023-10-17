package com.saurabhsameer.service;

import com.saurabhsameer.service.model.User;

public interface UserService {

  User createAuthor(User user);

  User getAuthor(String authorId);

  void deleteAuthor(String authorId);

  User updateAuthor(User user);

}
