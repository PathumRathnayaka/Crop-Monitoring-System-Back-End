package com.example.crop_monitoring_backend.entity.impl;

import com.example.crop_monitoring_backend.entity.SuperEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "vehicle")
public class VehicleEntity implements SuperEntity {
    @Id
    private String vehicle_code;
    @Column(unique = true)
    private String licensePlateNum;
    private String category;
    private String fuel_type;
    private String status;
    private String remarks;
    @ManyToOne
    @JoinColumn(name = "staffId")
    private StaffEntity staff;
}
