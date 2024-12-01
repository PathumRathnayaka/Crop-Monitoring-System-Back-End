package com.example.crop_monitoring_backend.service.impl;

import com.example.crop_monitoring_backend.customStatusCodes.ErrorStatusCodes;
import com.example.crop_monitoring_backend.dao.StaffDAO;
import com.example.crop_monitoring_backend.dto.StaffStatus;
import com.example.crop_monitoring_backend.dto.impl.FieldDTO;
import com.example.crop_monitoring_backend.dto.impl.StaffDTO;
import com.example.crop_monitoring_backend.dto.impl.VehicleDTO;
import com.example.crop_monitoring_backend.entity.impl.StaffEntity;
import com.example.crop_monitoring_backend.enums.Designation;
import com.example.crop_monitoring_backend.enums.Gender;
import com.example.crop_monitoring_backend.enums.Role;
import com.example.crop_monitoring_backend.exception.DataPersistException;
import com.example.crop_monitoring_backend.exception.StaffNotFoundException;
import com.example.crop_monitoring_backend.service.StaffService;
import com.example.crop_monitoring_backend.utill.AppUtill;
import com.example.crop_monitoring_backend.utill.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffDAO staffDAO;

    @Autowired
    private Mapping staffMapping;

    @Override
    public void saveStaff(StaffDTO staffDTO) {
        staffDTO.setStaffId(AppUtill.generateStaffCode());
        StaffEntity saveStaff=staffDAO.save(staffMapping.toStaffEntity(staffDTO));
        if (saveStaff!=null) {
            throw new DataPersistException("Staff not saved");
        }

    }

    @Override
    public List<StaffDTO> getAllStaffs() {
        return staffMapping.asStaffDTOList(staffDAO.findAll());
    }

    @Override
    public StaffStatus getStaff(String staffId) {
        if (staffDAO.existsById(staffId)){
            var selectedStaff=staffDAO.getReferenceById(staffId);
            return staffMapping.toStaffDTO(selectedStaff);
        }else {
            return new ErrorStatusCodes(1,"Selected Staff not found");
        }
    }

    @Override
    public void deleteStaff(String staffId) {
        Optional<StaffEntity> selectedStaff=staffDAO.findById(staffId);
        if (!selectedStaff.isPresent()){
            throw new DataPersistException("Selected Staff not found");
        }else {
            staffDAO.deleteById(staffId);
        }
    }

    @Override
    public void updateStaff(String staffId, StaffDTO staffDTO) {
        Optional<StaffEntity> findStaff=staffDAO.findById(staffId);
        if (!findStaff.isPresent()){
            throw new StaffNotFoundException("Selected Staff not found");
        }else {
            findStaff.get().setFirstName(staffDTO.getFirstName());
            findStaff.get().setLastName(staffDTO.getLastName());
            findStaff.get().setDesignation(staffDTO.getDesignation());
            findStaff.get().setGender(staffDTO.getGender());
            findStaff.get().setJoinedDate(staffDTO.getJoinedDate());
            findStaff.get().setDob(staffDTO.getDob());
            findStaff.get().setAddress1(staffDTO.getAddress1());
            findStaff.get().setAddress2(staffDTO.getAddress2());
            findStaff.get().setAddress3(staffDTO.getAddress3());
            findStaff.get().setAddress4(staffDTO.getAddress4());
            findStaff.get().setAddress5(staffDTO.getAddress5());
            findStaff.get().setContactNo(staffDTO.getContactNo());
            findStaff.get().setEmail(staffDTO.getEmail());
            findStaff.get().setRole(staffDTO.getRole());
            /*staffDAO.save(findStaff.get());*/
        }
    }
}
