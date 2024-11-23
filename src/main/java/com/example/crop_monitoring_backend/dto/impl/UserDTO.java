package com.example.crop_monitoring_backend.dto.impl;

import com.example.crop_monitoring_backend.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String user_id;
    private String email;
    private String password;
    private Role role;
}
