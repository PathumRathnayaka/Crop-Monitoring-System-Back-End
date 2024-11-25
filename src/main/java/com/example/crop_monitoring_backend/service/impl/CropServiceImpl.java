package com.example.crop_monitoring_backend.service.impl;

import com.example.crop_monitoring_backend.customStatusCodes.ErrorStatusCodes;
import com.example.crop_monitoring_backend.dao.CropDAO;
import com.example.crop_monitoring_backend.dto.CropStatus;
import com.example.crop_monitoring_backend.dto.impl.CropDTO;
import com.example.crop_monitoring_backend.entity.impl.CropEntity;
import com.example.crop_monitoring_backend.exception.DataPersistException;
import com.example.crop_monitoring_backend.service.CropService;
import com.example.crop_monitoring_backend.utill.AppUtill;
import com.example.crop_monitoring_backend.utill.Mapping;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
public class CropServiceImpl implements CropService {

    @Autowired
    private CropDAO cropDAO;
    @Autowired
    private Mapping cropMapping;


    @Override
    public void saveCrop(CropDTO cropDTO) {
        cropDTO.setCCode(AppUtill.generateCropCode());
        CropEntity saveCrop=cropDAO.save(cropMapping.toCropEntity(cropDTO));
        if (saveCrop==null){
            throw new DataPersistException("Crop not saved");
        }

    }

    @Override
    public List<CropDTO> getAllCrops() {
        return cropMapping.asCropDTOList(cropDAO.findAll());
    }

    @Override
    public CropStatus getCrop(String cropId) {
        if (cropDAO.existsById(cropId)){
            var selectedUser = cropDAO.getReferenceById(cropId);
            return cropMapping.toCropDTO(selectedUser);
        }else {
            return new ErrorStatusCodes(2,"Selected Crop not found");
        }

    }

    @Override
    public void deleteCrop(String cropId) {

    }

    @Override
    public void updateCrop(String cropId, CropDTO cropDTO) {

    }
}
