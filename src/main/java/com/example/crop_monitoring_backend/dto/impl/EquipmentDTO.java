package com.example.crop_monitoring_backend.dto.impl;

import com.example.crop_monitoring_backend.dto.EquipmentsStatus;

import com.example.crop_monitoring_backend.enums.EquipmentStatus;
import com.example.crop_monitoring_backend.enums.EquipmentType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentDTO implements EquipmentsStatus {
    String EquipmentId;
    String name;
    @Enumerated(EnumType.STRING)
    EquipmentType equipmentType;
    @Enumerated(EnumType.STRING)
    EquipmentStatus status;
    StaffDTO staff;
    FieldDTO field;
}
