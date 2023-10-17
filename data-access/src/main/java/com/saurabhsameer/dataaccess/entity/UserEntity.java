package com.saurabhsameer.dataaccess.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "user")
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  @Column(name = "name")
  private String name;
  @Column(name = "email")
  private String email;
  @Column(name = "password")
  private String password;
  @Column(name = "created_at")
  private OffsetDateTime createdAt;
  @Column(name = "modified_at")
  private OffsetDateTime modifiedAt;
  @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<BlogEntity> blogs;

  @PrePersist
  public void prePersistProcess() {
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

  public Set<BlogEntity> getBlogs() {
    return blogs;
  }

  public void setBlogs(Set<BlogEntity> blogs) {
    this.blogs = blogs;
  }
}
