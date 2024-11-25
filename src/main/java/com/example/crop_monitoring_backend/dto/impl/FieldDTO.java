package com.example.crop_monitoring_backend.dto.impl;

import com.example.crop_monitoring_backend.dto.FieldStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FieldDTO implements FieldStatus {
    private String fieldCode;
    private String fieldName;
    private Point fieldLocation;
    private Double extent_size;
    private String image1;
    private String image2;
    private java.util.List<CropDTO> cropDTOS;
    private List<String> staffIds;
}
