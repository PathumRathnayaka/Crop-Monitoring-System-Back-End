package com.example.crop_monitoring_backend.service;

import com.example.crop_monitoring_backend.dto.UserStatus;
import com.example.crop_monitoring_backend.dto.impl.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();
    UserStatus getUser(String userId);
    void deleteUser(String userId);
    void updateUser(String userId, UserDTO userDTO);
}
