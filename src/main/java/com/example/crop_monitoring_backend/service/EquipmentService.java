package com.example.crop_monitoring_backend.service;

import com.example.crop_monitoring_backend.dto.EquipmentsStatus;
import com.example.crop_monitoring_backend.dto.impl.EquipmentDTO;

import java.util.List;

public interface EquipmentService {
    void saveEquipment(EquipmentDTO equipmentDTO);
    List<EquipmentDTO> getAllEquipment();
    EquipmentsStatus getEquipment(String equipmentId);
    void deleteEquipment(String equipmentId);
    void updateEquipment(String equipmentId, EquipmentDTO equipmentDTO);
}
