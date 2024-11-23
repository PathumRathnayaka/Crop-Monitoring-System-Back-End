package com.example.crop_monitoring_backend.service;

import com.example.crop_monitoring_backend.dto.LogStatus;
import com.example.crop_monitoring_backend.dto.impl.LogDTO;

import java.util.List;

public interface LogService {
    void saveLog(LogDTO logDTO);
    List<LogDTO> getAllLogs();
    LogStatus getLog(String logId);
    void deleteLog(String logId);
    void updateLog(String logId, LogDTO logDTO);
}
