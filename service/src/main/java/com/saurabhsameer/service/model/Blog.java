package com.saurabhsameer.service.model;

import java.util.Set;
import java.util.UUID;

public class Blog {
  private UUID id;

  private String content;

  private Set<Media> media;

  private User author;

  private Long createdAt;

  private Long modifiedAt;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Set<Media> getMedia() {
    return media;
  }

  public void setMedia(Set<Media> media) {
    this.media = media;
  }

  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public Long getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

}
