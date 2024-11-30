package com.example.crop_monitoring_backend.service.impl;

import com.example.crop_monitoring_backend.customStatusCodes.ErrorStatusCodes;
import com.example.crop_monitoring_backend.dao.FieldDAO;
import com.example.crop_monitoring_backend.dto.FieldStatus;
import com.example.crop_monitoring_backend.dto.impl.CropDTO;
import com.example.crop_monitoring_backend.dto.impl.FieldDTO;
import com.example.crop_monitoring_backend.entity.impl.FieldEntity;
import com.example.crop_monitoring_backend.exception.DataPersistException;
import com.example.crop_monitoring_backend.exception.FieldNotFoundException;
import com.example.crop_monitoring_backend.service.FieldService;
import com.example.crop_monitoring_backend.utill.AppUtill;
import com.example.crop_monitoring_backend.utill.Mapping;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FieldServiceImpl implements FieldService {

    @Autowired
    private FieldDAO fieldDAO;

    @Autowired
    private Mapping fieldMapping;

    @Override
    public void saveField(FieldDTO fieldDTO) {
        fieldDTO.setFieldCode(AppUtill.generateFieldCode());
        FieldEntity saveField = fieldDAO.save(fieldMapping.toFIeldEntity(fieldDTO));
        if (saveField==null){
            throw new DataPersistException("Field not Saved!");
        }

    }

    @Override
    public List<FieldDTO> getAllFields() {
        return fieldMapping.asFieldDTOList(fieldDAO.findAll());
    }

    @Override
    public FieldStatus getField(String fieldId) {
        if (fieldDAO.existsById(fieldId)){
            var selectedField=fieldDAO.getReferenceById(fieldId);
            return fieldMapping.tofieldDTO(selectedField);
        }else {
            return new ErrorStatusCodes(1,"Selected Field not found");

        }
    }

    @Override
    public void deleteField(String fieldId) {
        Optional<FieldEntity> foundField=fieldDAO.findById(fieldId);
        if (!foundField.isPresent()){
            throw new FieldNotFoundException("Field not Found");
        }
    }

    @Override
    public void updateField(String fieldId, FieldDTO fieldDTO) {
        Optional<FieldEntity> findField = fieldDAO.findById(fieldId);
        if (!findField.isPresent()){
            throw new FieldNotFoundException("Field not Found");
        }else {
            findField.get().setFieldName(fieldDTO.getFieldName());
            findField.get().setFieldLocation(fieldDTO.getFieldLocation());
            findField.get().setExtent_size(fieldDTO.getExtent_size());
            findField.get().setImage1(fieldDTO.getImage1());
            findField.get().setImage2(fieldDTO.getImage2());
        }
    }
}
