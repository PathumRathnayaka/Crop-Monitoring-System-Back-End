package com.example.crop_monitoring_backend.dto.impl;

import java.awt.*;
import java.util.List;

public class FieldDTO {
    private String fieldCode;
    private String fieldName;
    private Point fieldLocation;
    private Double extent_size;
    private String image1;
    private String image2;
    private java.util.List<CropDTO> cropDTOS;
    private List<String> staffIds;
}
