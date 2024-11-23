package com.example.crop_monitoring_backend.service;

import com.example.crop_monitoring_backend.dto.CropStatus;
import com.example.crop_monitoring_backend.dto.impl.CropDTO;

import java.util.List;

public interface CropService {
    void saveCrop(CropDTO cropDTO);
    List<CropDTO> getAllCrops();
    CropStatus getCrop(String cropId);
    void deleteCrop(String cropId);
    void updateCrop(String cropId, CropDTO cropDTO);
}
