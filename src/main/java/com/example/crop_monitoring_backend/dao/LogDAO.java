package com.example.crop_monitoring_backend.dao;

import com.example.crop_monitoring_backend.entity.impl.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogDAO extends JpaRepository<LogEntity, String> {
}
