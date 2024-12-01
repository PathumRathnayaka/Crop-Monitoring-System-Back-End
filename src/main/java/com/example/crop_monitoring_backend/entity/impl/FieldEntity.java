package com.example.crop_monitoring_backend.entity.impl;

import com.example.crop_monitoring_backend.entity.SuperEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.geo.Point;

import java.util.List;


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
    private Point fieldLocation;
    private Double extent_size;
    @Column(columnDefinition = "LONGTEXT")
    private String image1;
    @Column(columnDefinition = "LONGTEXT")
    private String image2;
    @OneToMany(mappedBy = "field", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<CropEntity> crops;

    @OneToMany(mappedBy = "field",cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private List<StaffEntity> staffs;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(
            name = "FieldEquipment",
            joinColumns = @JoinColumn(name = "fieldId"),
            inverseJoinColumns = @JoinColumn(name = "equipmentId")
    )
    private List<EquipmentEntity> equipment;

    @OneToMany(mappedBy = "fields",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<LogEntity> logs;


}
