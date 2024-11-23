package com.example.crop_monitoring_backend.service;

import com.example.crop_monitoring_backend.dto.VehicleStatus;
import com.example.crop_monitoring_backend.dto.impl.VehicleDTO;

import java.util.List;

public interface VehicleService {
    void saveVehicle(VehicleDTO vehicleDTO);
    List<VehicleDTO> getAllVehicle();
    VehicleStatus getVehicle(String vehicleId);
    void deleteVehicle(String vehicleId);
    void updateVehicle(String vehicleId, VehicleDTO vehicleDTO);
}
