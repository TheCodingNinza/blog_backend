package com.saurabhsameer.dataaccess.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "blog")
public class BlogEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(name = "content")
  private String content;

  @OneToMany(mappedBy = "blog", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<MediaEntity> media;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "author_id")
  private UserEntity author;

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

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Set<MediaEntity> getMedia() {
    return media;
  }

  public void setMedia(Set<MediaEntity> media) {
    this.media = media;
  }

  public UserEntity getAuthor() {
    return author;
  }

  public void setAuthor(UserEntity author) {
    this.author = author;
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

}
