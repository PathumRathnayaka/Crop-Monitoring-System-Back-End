package com.example.crop_monitoring_backend.dto.impl;

import com.example.crop_monitoring_backend.dto.CropStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CropDTO implements CropStatus {
    String cropCode;
    String commonName;
    String scientificName;
    String image;
    String category;
    String season;
    FieldDTO fieldDTO;
}
