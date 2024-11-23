package com.example.crop_monitoring_backend.utill;

import com.example.crop_monitoring_backend.dto.impl.CropDTO;
import com.example.crop_monitoring_backend.dto.impl.FieldDTO;
import com.example.crop_monitoring_backend.dto.impl.StaffDTO;
import com.example.crop_monitoring_backend.entity.impl.CropEntity;
import com.example.crop_monitoring_backend.entity.impl.FIeldEntity;
import com.example.crop_monitoring_backend.entity.impl.StaffEntity;
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

    public FieldDTO tofieldDTO(FIeldEntity fIeldEntity) {
        return mapper.map(fIeldEntity, FieldDTO.class);
    }
    public FIeldEntity toFIeldEntity(FieldDTO fieldDTO) {
        return mapper.map(fieldDTO, FIeldEntity.class);
    }
    public List<FieldDTO> asFieldDTOList(List<FIeldEntity> fIeldEntities) {
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
}
