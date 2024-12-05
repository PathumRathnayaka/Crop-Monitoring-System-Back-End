package com.example.crop_monitoring_backend.service.impl;

import com.example.crop_monitoring_backend.customStatusCodes.ErrorStatusCodes;
import com.example.crop_monitoring_backend.dao.LogDAO;
import com.example.crop_monitoring_backend.dto.LogStatus;
import com.example.crop_monitoring_backend.dto.impl.LogDTO;
import com.example.crop_monitoring_backend.entity.impl.LogEntity;
import com.example.crop_monitoring_backend.exception.DataPersistException;
import com.example.crop_monitoring_backend.service.LogService;
import com.example.crop_monitoring_backend.utill.AppUtill;
import com.example.crop_monitoring_backend.utill.Mapping;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDAO logDAO;

    @Autowired
    private Mapping logMapping;


    @Override
    public void saveLog(LogDTO logDTO) {
        logDTO.setLogCode(AppUtill.generateLogCode());
        LogEntity saveLog=logDAO.save(logMapping.toLogEntity(logDTO));
        if (saveLog==null){
            throw new DataPersistException("Log not saved");
        }

    }

    @Override
    public List<LogDTO> getAllLogs() {
        return logMapping.asLogDTOList(logDAO.findAll());
    }

    @Override
    public LogStatus getLog(String logId) {
        if (logDAO.existsById(logId)){
            var selectedLog=logDAO.getReferenceById(logId);
            return logMapping.toLogDTO(selectedLog);
        }else {
            return new ErrorStatusCodes(1,"Selected Log not found");
        }
    }

    @Override
    public void deleteLog(String logId) {
        Optional<LogEntity> foundLog=logDAO.findById(logId);
        if (!foundLog.isPresent()){
            throw new DataPersistException("Log not found");
        }else {
            logDAO.deleteById(logId);
        }

    }

    @Override
    public void updateLog(String logId, LogDTO logDTO) {
        Optional<LogEntity> foundLog=logDAO.findById(logId);
        if (!foundLog.isPresent()){
            throw new DataPersistException("Log not found");
        }else {
            foundLog.get().setDate(logDTO.getDate());
            foundLog.get().setObservation(logDTO.getObservation());
            foundLog.get().setFieldEntity(logMapping.toFIeldEntity(logDTO.getFieldDTO()));

        }

    }
}
