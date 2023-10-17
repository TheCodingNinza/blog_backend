package com.saurabhsameer.service;

import com.saurabhsameer.service.model.Media;

import java.util.List;

public interface MediaService {

  List<Media> getMediasInBlog(String blogId);

  Media getMediaById(String id);

}
