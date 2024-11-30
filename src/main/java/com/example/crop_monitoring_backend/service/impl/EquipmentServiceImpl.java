package com.example.crop_monitoring_backend.service.impl;

import com.example.crop_monitoring_backend.dto.EquipmentStatus;
import com.example.crop_monitoring_backend.dto.impl.EquipmentDTO;
import com.example.crop_monitoring_backend.service.EquipmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EquipmentServiceImpl implements EquipmentService {
    @Override
    public void saveEquipment(EquipmentDTO equipmentDTO) {

    }

    @Override
    public List<EquipmentDTO> getAllEquipment() {
        return List.of();
    }

    @Override
    public EquipmentStatus getEquipment(String equipmentId) {
        return null;
    }

    @Override
    public void deleteEquipment(String equipmentId) {

    }

    @Override
    public void updateEquipment(String equipmentId, EquipmentDTO equipmentDTO) {

    }
}
