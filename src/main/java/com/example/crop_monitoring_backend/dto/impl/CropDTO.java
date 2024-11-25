package com.example.crop_monitoring_backend.dto.impl;

import com.example.crop_monitoring_backend.dto.CropStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CropDTO implements CropStatus {
    private String CCode;
    private String CCommonName;
    private String CScientificName;
    private String CropImage;
    private String Category;
    private String CropSession;
    private String field;

}
