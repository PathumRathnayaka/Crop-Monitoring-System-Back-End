package com.example.crop_monitoring_backend.controller;

import com.example.crop_monitoring_backend.customStatusCodes.ErrorStatusCodes;
import com.example.crop_monitoring_backend.dto.StaffStatus;
import com.example.crop_monitoring_backend.dto.impl.StaffDTO;
import com.example.crop_monitoring_backend.exception.StaffNotFoundException;
import com.example.crop_monitoring_backend.exception.DataPersistException;
import com.example.crop_monitoring_backend.service.StaffService;
import com.example.crop_monitoring_backend.utill.RegexProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/staffs")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> saveStaff(@RequestBody StaffDTO staffDTO) {
        try {
            staffService.saveStaff(staffDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (DataPersistException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/{staffId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public StaffStatus getSelectedStaff(@PathVariable("staffId") String staffId) {
        if (!RegexProcess.staffIdMatcher(staffId)) {
            return new ErrorStatusCodes(1, "Staff Id is Not Valid");
        }
        return staffService.getStaff(staffId);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<StaffDTO> getAllStaffs() {
        return staffService.getAllStaffs();
    }

    @DeleteMapping(value = "/{staffId}")
    public ResponseEntity<Void> deleteStaff(@PathVariable("staffId") String staffId) {
        try {
            if (!RegexProcess.staffIdMatcher(staffId)) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            staffService.deleteStaff(staffId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (StaffNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(value = "/{staffId}")
    public ResponseEntity<Void> updateStaff(@PathVariable("staffId") String staffId, @RequestBody StaffDTO staffDTO) {
        try {
            if (!RegexProcess.staffIdMatcher(staffId) || staffDTO == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            staffService.updateStaff(staffId, staffDTO);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (StaffNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
