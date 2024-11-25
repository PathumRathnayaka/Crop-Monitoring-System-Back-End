package com.example.crop_monitoring_backend.customStatusCodes;

import com.example.crop_monitoring_backend.dto.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorStatusCodes implements CropStatus, EquipmentStatus, FieldStatus, LogStatus, StaffStatus,UserStatus,VehicleStatus {
    private int statusCode;
    private String statusMessage;
}
