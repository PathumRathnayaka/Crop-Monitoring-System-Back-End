package com.example.crop_monitoring_backend.dao;

import com.example.crop_monitoring_backend.entity.impl.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffDAO extends JpaRepository<StaffEntity, String> {
}
