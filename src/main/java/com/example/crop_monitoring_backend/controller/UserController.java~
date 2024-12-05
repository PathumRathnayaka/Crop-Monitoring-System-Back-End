package com.example.crop_monitoring_backend.controller;

import com.example.crop_monitoring_backend.customStatusCodes.ErrorStatusCodes;
import com.example.crop_monitoring_backend.dto.UserStatus;
import com.example.crop_monitoring_backend.dto.impl.UserDTO;
import com.example.crop_monitoring_backend.exception.UserNotFoundException;
import com.example.crop_monitoring_backend.exception.DataPersistException;
import com.example.crop_monitoring_backend.service.UserService;
import com.example.crop_monitoring_backend.utill.RegexProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> saveUser(@RequestBody UserDTO userDTO) {
        try {
            userService.saveUser(userDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (DataPersistException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserStatus getSelectedUser(@PathVariable("userId") String userId) {
        if (!RegexProcess.userIdMatcher(userId)) {
            return new ErrorStatusCodes(1, "User Id is Not Valid");
        }
        return userService.getUser(userId);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping(value = "/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable("userId") String userId) {
        try {
            if (!RegexProcess.userIdMatcher(userId)) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            userService.deleteUser(userId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(value = "/{userId}")
    public ResponseEntity<Void> updateUser(@PathVariable("userId") String userId, @RequestBody UserDTO userDTO) {
        try {
            if (!RegexProcess.userIdMatcher(userId) || userDTO == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            userService.updateUser(userId, userDTO);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
