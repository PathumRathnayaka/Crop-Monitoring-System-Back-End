package com.example.crop_monitoring_backend.dao;

import com.example.crop_monitoring_backend.entity.impl.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleDAO extends JpaRepository<VehicleEntity, String> {
}
