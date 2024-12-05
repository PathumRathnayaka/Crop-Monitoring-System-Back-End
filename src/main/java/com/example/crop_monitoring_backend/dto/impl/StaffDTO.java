package com.example.crop_monitoring_backend.dto.impl;

import com.example.crop_monitoring_backend.dto.StaffStatus;
import com.example.crop_monitoring_backend.enums.Gender;
import com.example.crop_monitoring_backend.enums.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffDTO implements StaffStatus {
    String id;
    String firstName;
    String lastName;
    String designation;
    @Enumerated(EnumType.STRING)
    Gender gender;
    Date joinedDate;
    Date dob;
    String address;
    String contact;
    String email;
    @Enumerated(EnumType.STRING)
    Role role;
    List<FieldDTO> fields;
}
