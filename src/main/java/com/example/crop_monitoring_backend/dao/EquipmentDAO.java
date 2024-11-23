package com.example.crop_monitoring_backend.dao;

import com.example.crop_monitoring_backend.entity.impl.EquipmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentDAO extends JpaRepository<EquipmentEntity,String> {
}
