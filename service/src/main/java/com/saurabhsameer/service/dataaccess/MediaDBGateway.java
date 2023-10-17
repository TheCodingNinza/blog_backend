package com.saurabhsameer.service.dataaccess;

import com.saurabhsameer.service.model.Media;

import java.util.List;

public interface MediaDBGateway {

  List<Media> getMediasInBlog(String blogId);

  Media getMediaById(String id);

}
