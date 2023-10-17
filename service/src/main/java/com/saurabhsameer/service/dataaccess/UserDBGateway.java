package com.saurabhsameer.service.dataaccess;

import com.saurabhsameer.service.model.User;

public interface UserDBGateway {

  User createAuthor(User user);

  User getAuthor(String authorId);

  void deleteAuthor(String authorId);

  User updateAuthor(User user);

}
