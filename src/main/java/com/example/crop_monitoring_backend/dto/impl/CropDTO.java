package com.example.crop_monitoring_backend.dto.impl;

import com.example.crop_monitoring_backend.dto.CropStatus;
import com.example.crop_monitoring_backend.entity.impl.FieldEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class CropDTO implements CropStatus {
    private String cCode;
    private String cCommonName;
    private String cScientificName;
    private String cropImage;
    private String category;
    private String cropSeason ;
    private FieldEntity fieldCode;

}
