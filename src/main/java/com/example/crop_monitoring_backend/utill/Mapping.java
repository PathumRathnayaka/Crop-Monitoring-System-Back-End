package com.example.crop_monitoring_backend.utill;

import com.example.crop_monitoring_backend.dto.impl.*;
import com.example.crop_monitoring_backend.entity.impl.*;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Mapping {

    @Autowired
    private ModelMapper mapper;

    /*field Mapping-----*/

    public FieldDTO tofieldDTO(FieldEntity fIeldEntity) {
        return mapper.map(fIeldEntity, FieldDTO.class);
    }
    public FieldEntity toFIeldEntity(FieldDTO fieldDTO) {
        return mapper.map(fieldDTO, FieldEntity.class);
    }
    public List<FieldDTO> asFieldDTOList(List<FieldEntity> fIeldEntities) {
        return mapper.map(fIeldEntities, new TypeToken<List<FieldDTO>>(){}.getType());
    }

    /*Crop Mapping-------*/
    public CropDTO toCropDTO(CropEntity cropEntity){
        return mapper.map(cropEntity, CropDTO.class);
    }
    public CropEntity toCropEntity(CropDTO cropDTO){
        return mapper.map(cropDTO, CropEntity.class);

    }
    public List<CropDTO> asCropDTOList(List<CropEntity> cropEntities){
        return mapper.map(cropEntities, new TypeToken<List<CropDTO>>(){}.getType());
    }

    /*Staff Mapping-------*/
    public StaffDTO toStaffDTO(StaffEntity staffEntity){
        return mapper.map(staffEntity, StaffDTO.class);
    }

    public StaffEntity toStaffEntity(StaffDTO staffDTO){
        return mapper.map(staffDTO , StaffEntity.class);
    }
    public List<StaffDTO> asStaffDTOList(List<StaffEntity> staffEntities){
        return mapper.map(staffEntities, new TypeToken<List<StaffDTO>>(){}.getType());
    }

    /*Vehicle Mapping--------------*/
    public VehicleDTO toVehicleDTO(VehicleEntity vehicleEntity){
        return mapper.map(vehicleEntity, VehicleDTO.class);
    }
    public VehicleEntity toVehicleEntity(VehicleDTO vehicleDTO){
        return mapper.map(vehicleDTO, VehicleEntity.class);
    }
    public List<VehicleDTO> asVehicleDTOList(List<VehicleEntity> vehicleEntities){
        return mapper.map(vehicleEntities, new TypeToken<List<VehicleDTO>>(){}.getType());
    }

      /* Equipment mapping--------*/

    public EquipmentEntity toEquipmentEntity(EquipmentDTO equipmentDTO) {
        return mapper.map(equipmentDTO, EquipmentEntity.class);
    }

    public List<EquipmentDTO> asEquipmentDTOList(List<EquipmentEntity> equipmentEntities) {
        return mapper.map(equipmentEntities,new TypeToken<List<EquipmentDTO>>(){}.getType());
    }

    public EquipmentDTO toEquipmentDTO(EquipmentEntity equipmentEntity) {
        return mapper.map(equipmentEntity,EquipmentDTO.class);
    }

      /*for log mapping------*/
    public LogEntity toLogEntity(LogDTO logDTO) {
        return mapper.map(logDTO, LogEntity.class);
    }

    public List<LogDTO> asLogDTOList(List<LogEntity> logEntities) {
        return mapper.map(logEntities,new TypeToken<List<LogDTO>>(){}.getType());
    }
    public LogDTO toLogDTO(LogEntity logEntity) {
        return mapper.map(logEntity,LogDTO.class);
    }

    /* User Mapping */


}
