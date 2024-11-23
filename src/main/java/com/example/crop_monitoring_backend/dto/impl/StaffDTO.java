package com.example.crop_monitoring_backend.dto.impl;

import com.example.crop_monitoring_backend.enums.Designation;
import com.example.crop_monitoring_backend.enums.Gender;
import com.example.crop_monitoring_backend.enums.Role;

import java.util.Date;
import java.util.List;

public class StaffDTO {
    private String id;
    private String firstName;
    private String lastName;
    private Designation designation;
    private Gender gender;
    private Date joinedDate;
    private Date dob;
    private String address1;
    private String address2;
    private String address3;
    private String address4;
    private String address5;
    private String contactNo;
    private String email;
    private Role role;
    private List<FieldDTO> fields;
    private List<VehicleDTO> vehicles;
}
