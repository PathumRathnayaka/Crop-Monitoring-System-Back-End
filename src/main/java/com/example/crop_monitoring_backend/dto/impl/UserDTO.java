package com.example.crop_monitoring_backend.dto.impl;

import com.example.crop_monitoring_backend.dto.UserStatus;
import com.example.crop_monitoring_backend.enums.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements UserStatus {
    String id;
    String name;
    String email;
    String password;
    @Enumerated(EnumType.STRING)
    Role userRole;
    boolean status;
}
