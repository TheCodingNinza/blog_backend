package com.saurabhsameer.dataaccess.repository;

import com.saurabhsameer.dataaccess.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
}
