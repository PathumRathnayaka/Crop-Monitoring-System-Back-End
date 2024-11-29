package com.example.crop_monitoring_backend.dto.impl;

import com.example.crop_monitoring_backend.dto.EquipmentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentDTO implements EquipmentStatus {
    private String equipmentId;
    private String name;
    private String status;
    private String type;
    private String field_code;
    private String staffId;
}
