package com.example.crop_monitoring_backend.entity.impl;

import com.example.crop_monitoring_backend.dto.UserStatus;
import com.example.crop_monitoring_backend.dto.impl.UserDTO;
import com.example.crop_monitoring_backend.entity.SuperEntity;
import com.example.crop_monitoring_backend.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class UserEntity implements SuperEntity {
    @Id
    private String userId;
    private String userName;
    private Role role;

}
