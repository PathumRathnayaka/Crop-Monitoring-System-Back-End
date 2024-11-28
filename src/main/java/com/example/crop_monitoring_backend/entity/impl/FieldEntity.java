package com.example.crop_monitoring_backend.entity.impl;

import com.example.crop_monitoring_backend.entity.SuperEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "field")
public class FieldEntity implements SuperEntity {
    @Id
    private String fieldCode;
    @Column(unique = true)
    private String fieldName;
    private Point location;
    private Double extendSize;
    @Column(columnDefinition = "LONGTEXT")
    private String image1;
    @Column(columnDefinition = "LONGTEXT")
    private String image2;
    private List<CropEntity> crops;
    @ManyToMany(mappedBy = "field",cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private List<StaffEntity> staffs;
    private List<EquipmentEntity> equipment;
    private List<LogEntity> logs;
}
