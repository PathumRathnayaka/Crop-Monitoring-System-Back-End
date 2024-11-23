package com.example.crop_monitoring_backend.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentDTO {
    private String equipment_id;
    private String name;
    private String status;
    private String type;
    private String field_code;
    private String staffId;
}