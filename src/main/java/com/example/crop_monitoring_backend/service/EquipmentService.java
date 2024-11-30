package com.example.crop_monitoring_backend.service;

import com.example.crop_monitoring_backend.dto.EquipmentStatus;
import com.example.crop_monitoring_backend.dto.FieldStatus;
import com.example.crop_monitoring_backend.dto.impl.EquipmentDTO;
import com.example.crop_monitoring_backend.dto.impl.FieldDTO;

import java.util.List;

public interface EquipmentService {
    void saveEquipment(EquipmentDTO equipmentDTO);
    List<EquipmentDTO> getAllEquipment();
    EquipmentStatus getEquipment(String equipmentId);
    void deleteEquipment(String equipmentId);
    void updateEquipment(String equipmentId, EquipmentDTO equipmentDTO);
}
