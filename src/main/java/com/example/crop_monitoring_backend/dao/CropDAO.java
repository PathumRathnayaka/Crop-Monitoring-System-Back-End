package com.example.crop_monitoring_backend.dao;

import com.example.crop_monitoring_backend.entity.impl.CropEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CropDAO extends JpaRepository<CropEntity, String> {
}
