package com.example.crop_monitoring_backend.dto.impl;

import com.example.crop_monitoring_backend.dto.FieldStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FieldDTO implements FieldStatus {
    String fieldCode;
    String fieldName;
    String fieldLocation;
    double  fieldSize;
    String fieldImage;
    String fieldImage2;
}
