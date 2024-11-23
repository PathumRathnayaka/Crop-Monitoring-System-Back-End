package com.example.crop_monitoring_backend.service.impl;

import com.example.crop_monitoring_backend.dao.CropDAO;
import com.example.crop_monitoring_backend.dto.CropStatus;
import com.example.crop_monitoring_backend.dto.impl.CropDTO;
import com.example.crop_monitoring_backend.entity.impl.CropEntity;
import com.example.crop_monitoring_backend.service.CropService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
public class CropServiceImpl implements CropService {

    @Autowired
    private CropDAO cropDAO;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public void saveCrop(CropDTO cropDTO) {

    }



    @Override
    public List<CropDTO> getAllCrops() {
        return List.of();
    }

    @Override
    public CropStatus getCrop(String cropId) {
        return null;
    }

    @Override
    public void deleteCrop(String cropId) {

    }

    @Override
    public void updateCrop(String cropId, CropDTO cropDTO) {

    }
}
