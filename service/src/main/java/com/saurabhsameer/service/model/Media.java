package com.saurabhsameer.service.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public class Media {
  private UUID id;

  private String url;

  private String title;

  private String subTitle;

  private Blog blog;

  private Long createdAt;

  private Long modifiedAt;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }

  public Blog getBlog() {
    return blog;
  }

  public void setBlog(Blog blog) {
    this.blog = blog;
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
