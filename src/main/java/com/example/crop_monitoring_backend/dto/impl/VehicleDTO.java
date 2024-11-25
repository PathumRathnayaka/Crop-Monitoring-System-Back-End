package com.example.crop_monitoring_backend.dto.impl;


import com.example.crop_monitoring_backend.dto.VehicleStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO implements VehicleStatus {
    private String vehicle_code;
    private String licensePlateNum;
    private String category;
    private String fuel_type;
    private String status;
    private String remarks;
    private String staffId;
}
