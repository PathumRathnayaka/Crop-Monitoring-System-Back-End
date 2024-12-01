package com.example.crop_monitoring_backend.service.impl;

import com.example.crop_monitoring_backend.customStatusCodes.ErrorStatusCodes;
import com.example.crop_monitoring_backend.dao.UserDAO;
import com.example.crop_monitoring_backend.dto.UserStatus;
import com.example.crop_monitoring_backend.dto.impl.UserDTO;
import com.example.crop_monitoring_backend.entity.impl.UserEntity;
import com.example.crop_monitoring_backend.exception.DataPersistException;
import com.example.crop_monitoring_backend.exception.UserNotFoundException;
import com.example.crop_monitoring_backend.service.UserService;
import com.example.crop_monitoring_backend.utill.AppUtill;
import com.example.crop_monitoring_backend.utill.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Autowired
    private Mapping userMapping;

    @Override
    public void saveUser(UserDTO userDTO) {
        userDTO.setUserId(AppUtill.generateUserCode());
        UserEntity saveUser = userDAO.save(userMapping.toUserEntity(userDTO));
        if (saveUser != null) {
            throw new DataPersistException("User not saved");
        }

    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userMapping.asUserDTOList(userDAO.findAll());
    }

    @Override
    public UserStatus getUser(String userId) {
        if (userDAO.existsById(userId)) {
            var selectedUser = userDAO.getReferenceById(userId);
            return userMapping.toUserDTO(selectedUser);
        }else {
            return new ErrorStatusCodes(1,"Selected User not found");
        }
    }

    @Override
    public void deleteUser(String userId) {
        Optional<UserEntity> selectedUser=userDAO.findById(userId);
        if (!selectedUser.isPresent()){
            throw new DataPersistException("Selected User not found");
        }else {
            userDAO.deleteById(userId);
        }

    }

    @Override
    public void updateUser(String userId, UserDTO userDTO) {
        Optional<UserEntity> findUser=userDAO.findById(userId);
        if (!findUser.isPresent()){
            throw new UserNotFoundException("Selected User not found");
        }else {
            findUser.get().setUserName(userDTO.getUserName());
            findUser.get().setEmail(userDTO.getEmail());
            findUser.get().setPassword(userDTO.getPassword());
            findUser.get().setRole(userDTO.getRole());
        }

    }
}
