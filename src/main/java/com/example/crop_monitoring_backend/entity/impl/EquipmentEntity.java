package com.example.crop_monitoring_backend.entity.impl;

import com.example.crop_monitoring_backend.entity.SuperEntity;
import com.example.crop_monitoring_backend.enums.EquipmentStatus;
import com.example.crop_monitoring_backend.enums.EquipmentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EquipmentEntity implements SuperEntity {
    @Id
    String EquipmentId;
    String name;
    @Enumerated(EnumType.STRING)
    EquipmentType equipmentType;
    @Enumerated(EnumType.STRING)
    EquipmentStatus status;

    @ManyToOne
    @JoinColumn(name = "id")
    StaffEntity staff;

    @ManyToOne
    @JoinColumn(name = "field_code")
    FieldEntity field;
}
