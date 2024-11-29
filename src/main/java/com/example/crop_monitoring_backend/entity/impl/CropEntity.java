package com.example.crop_monitoring_backend.entity.impl;


import com.example.crop_monitoring_backend.entity.SuperEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "crop")
public class CropEntity implements SuperEntity {
    @Id
    private String cCode;
    @Column(unique = true)
    private String cCommonName;
    private String cScientificName;
    @Column(columnDefinition = "LONGTEXT")
    private String cropImage;
    private String category;
    private String cropSeason ;
    @ManyToOne
    @JoinColumn(name = "fieldCode", nullable = false)
    private FieldEntity field;
    @OneToMany(mappedBy = "field",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<LogEntity> logs;
}
