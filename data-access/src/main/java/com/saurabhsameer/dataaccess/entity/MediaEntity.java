package com.saurabhsameer.dataaccess.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;

@Entity
@Table(name = "media")
public class MediaEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  @Column(name = "url")
  private String url;
  @Column(name = "title")
  private String title;
  @Column(name = "sub_title")
  private String subTitle;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "blog_id")
  private BlogEntity blog;
  @Column(name = "created_at")
  private OffsetDateTime createdAt;

  @Column(name = "modified_at")
  private OffsetDateTime modifiedAt;

  @PrePersist
  public void prePersistProcess(){
    setCreatedAt(OffsetDateTime.now(ZoneOffset.UTC));
    setModifiedAt(getCreatedAt());
  }

  @PreUpdate
  public void preUpdateProcess(){
    setModifiedAt(OffsetDateTime.now(ZoneOffset.UTC));
  }

  public UUID getId() {
    return id;
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

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public BlogEntity getBlog() {
    return blog;
  }

  public void setBlog(BlogEntity blog) {
    this.blog = blog;
  }

}
