package com.example.crop_monitoring_backend.service;

import com.example.crop_monitoring_backend.dto.StaffStatus;
import com.example.crop_monitoring_backend.dto.impl.StaffDTO;

import java.util.List;

public interface StaffService {
    void saveStaff(StaffDTO staffDTO);
    List<StaffDTO> getAllStaffs();
    StaffStatus getStaff(String staffId);
    void deleteStaff(String staffId);
    void updateStaff(String staffId, StaffDTO staffDTO);
}
