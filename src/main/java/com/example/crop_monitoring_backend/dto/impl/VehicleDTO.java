package com.example.crop_monitoring_backend.dto.impl;

import com.example.crop_monitoring_backend.dto.VehicleStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO implements VehicleStatus {
    String vehicleCode;
    String licensePlateNum;
    String category;
    String fuelType;
    String status;
    String remarks;
    StaffDTO staff;
}
