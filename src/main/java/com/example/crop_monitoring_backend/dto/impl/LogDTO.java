package com.example.crop_monitoring_backend.dto.impl;

import com.example.crop_monitoring_backend.dto.LogStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogDTO implements LogStatus {
    String logCode;
    Date date;
    String observation;
    String observationImage;
    FieldDTO fieldDTO;
    StaffDTO staffDTO;
    CropDTO cropDTO;
}
