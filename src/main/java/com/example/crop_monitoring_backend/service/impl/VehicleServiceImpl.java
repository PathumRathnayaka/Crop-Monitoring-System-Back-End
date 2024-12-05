package com.example.crop_monitoring_backend.service.impl;

import com.example.crop_monitoring_backend.customStatusCodes.ErrorStatusCodes;
import com.example.crop_monitoring_backend.dao.VehicleDAO;
import com.example.crop_monitoring_backend.dto.VehicleStatus;
import com.example.crop_monitoring_backend.dto.impl.VehicleDTO;
import com.example.crop_monitoring_backend.entity.impl.VehicleEntity;
import com.example.crop_monitoring_backend.exception.DataPersistException;
import com.example.crop_monitoring_backend.exception.VehicleNotFoundException;
import com.example.crop_monitoring_backend.service.VehicleService;
import com.example.crop_monitoring_backend.utill.AppUtill;
import com.example.crop_monitoring_backend.utill.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleDAO vehicleDAO;

    @Autowired
    private Mapping vehicleMapping;

    @Override
    public void saveVehicle(VehicleDTO vehicleDTO) {
        vehicleDTO.setVehicleCode(AppUtill.generateVehicleCode());
        VehicleEntity saveVehicle=vehicleDAO.save(vehicleMapping.toVehicleEntity(vehicleDTO));
        if (saveVehicle!=null) {
            throw new DataPersistException("Vehicle not saved");
        }

    }

    @Override
    public List<VehicleDTO> getAllVehicles() {
        return vehicleMapping.asVehicleDTOList(vehicleDAO.findAll());
    }

    @Override
    public VehicleStatus getVehicle(String vehicleId) {
        if (vehicleDAO.existsById(vehicleId)){
            var selectedVehicle=vehicleDAO.getReferenceById(vehicleId);
            return vehicleMapping.toVehicleDTO(selectedVehicle);
        }else {
            return new ErrorStatusCodes(1,"Selected Vehicle not found");
        }
    }

    @Override
    public void deleteVehicle(String vehicleId) {
        Optional<VehicleEntity> selectedVehicle=vehicleDAO.findById(vehicleId);
        if (!selectedVehicle.isPresent()){
            throw new VehicleNotFoundException("Selected Vehicle not found");
        }else {
            vehicleDAO.deleteById(vehicleId);
        }
    }

    @Override
    public void updateVehicle(String vehicleId, VehicleDTO vehicleDTO) {
        Optional<VehicleEntity> findVehicle=vehicleDAO.findById(vehicleId);
        if (!findVehicle.isPresent()){
            throw new VehicleNotFoundException("Selected Vehicle not found");
        }else {
            findVehicle.get().setLicensePlateNum(vehicleDTO.getLicensePlateNum());
            findVehicle.get().setCategory(vehicleDTO.getCategory());
            findVehicle.get().setFuelType(vehicleDTO.getFuelType());
            findVehicle.get().setStatus(vehicleDTO.getStatus());
            findVehicle.get().setRemarks(vehicleDTO.getRemarks());
        }

    }
}
