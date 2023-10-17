package com.saurabhsameer.dataaccess.repository;

import com.saurabhsameer.dataaccess.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BlogRepository extends JpaRepository<BlogEntity, UUID> {
}
