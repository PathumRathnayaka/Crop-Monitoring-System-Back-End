package com.example.crop_monitoring_backend.service;

import com.example.crop_monitoring_backend.dto.FieldStatus;
import com.example.crop_monitoring_backend.dto.impl.FieldDTO;

import java.util.List;

public interface FieldService {
    void saveField(FieldDTO fieldDTO);
    List<FieldDTO> getAllFields();
    FieldStatus getField(String fieldId);
    void deleteField(String fieldId);
    void updateField(String fieldId, FieldDTO fieldDTO);
}
