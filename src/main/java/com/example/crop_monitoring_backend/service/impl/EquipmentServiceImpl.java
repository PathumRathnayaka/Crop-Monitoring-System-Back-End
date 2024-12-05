package com.example.crop_monitoring_backend.service.impl;

import com.example.crop_monitoring_backend.customStatusCodes.ErrorStatusCodes;
import com.example.crop_monitoring_backend.dao.EquipmentDAO;
import com.example.crop_monitoring_backend.dto.EquipmentsStatus;
import com.example.crop_monitoring_backend.dto.impl.EquipmentDTO;
import com.example.crop_monitoring_backend.entity.impl.EquipmentEntity;
import com.example.crop_monitoring_backend.exception.DataPersistException;
import com.example.crop_monitoring_backend.service.EquipmentService;
import com.example.crop_monitoring_backend.utill.AppUtill;
import com.example.crop_monitoring_backend.utill.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    private EquipmentDAO equipmentDAO;
    @Autowired
    private Mapping equipmentMapping;

    @Override
    public void saveEquipment(EquipmentDTO equipmentDTO) {
        equipmentDTO.setEquipmentId(AppUtill.generateEquipmentCode());
        EquipmentEntity saveEquipment=equipmentDAO.save(equipmentMapping.toEquipmentEntity(equipmentDTO));
        if (saveEquipment==null){
            throw new DataPersistException("Equipment not saved");
        }
    }

    @Override
    public List<EquipmentDTO> getAllEquipment() {
        return equipmentMapping.asEquipmentDTOList(equipmentDAO.findAll());
    }

    @Override
    public EquipmentsStatus getEquipment(String equipmentId) {
        if (equipmentDAO.existsById(equipmentId)) {
            var selectedEquipment = equipmentDAO.getReferenceById(equipmentId);
            return equipmentMapping.toEquipmentDTO(selectedEquipment);
        } else {
            return new ErrorStatusCodes(1, "Selected Equipment not found");
        }
    }

    @Override
    public void deleteEquipment(String equipmentId) {
        Optional<EquipmentEntity> foundEquipment=equipmentDAO.findById(equipmentId);
        if (!foundEquipment.isPresent()){
            throw new DataPersistException("Equipment not found");
        }
        equipmentDAO.deleteById(equipmentId);
    }

    @Override
    public void updateEquipment(String equipmentId, EquipmentDTO equipmentDTO) {
        Optional<EquipmentEntity> findEquipment = equipmentDAO.findById(equipmentId);
        if (!findEquipment.isPresent()) {
            throw new DataPersistException("Equipment not found");
        } else {
            findEquipment.get().setName(equipmentDTO.getName());
            findEquipment.get().setStatus(equipmentDTO.getStatus());
            findEquipment.get().setEquipmentType(equipmentDTO.getEquipmentType());
            findEquipment.get().setStaff(equipmentMapping.toStaffEntity(equipmentDTO.getStaff()));
        }

    }
}
