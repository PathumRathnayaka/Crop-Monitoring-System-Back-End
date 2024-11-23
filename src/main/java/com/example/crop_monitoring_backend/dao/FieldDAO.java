package com.example.crop_monitoring_backend.dao;

import com.example.crop_monitoring_backend.entity.impl.FIeldEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FieldDAO extends JpaRepository<FIeldEntity, String> {
}
