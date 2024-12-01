package com.example.crop_monitoring_backend.dao;

import com.example.crop_monitoring_backend.entity.impl.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UserEntity, String> {
}
