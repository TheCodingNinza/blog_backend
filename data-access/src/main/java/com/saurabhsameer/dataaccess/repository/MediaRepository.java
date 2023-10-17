package com.saurabhsameer.dataaccess.repository;

import com.saurabhsameer.dataaccess.entity.MediaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MediaRepository extends JpaRepository<MediaEntity, UUID> {
}
