package com.example.crop_monitoring_backend.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogDTO {
    private String log_code;
    private String tempId;
    private Date date;
    private String details;
    private String image;
    private List<FieldDTO> fields;
    private List<CropDTO> crops;
    private List<StaffDTO> staffs;
}
