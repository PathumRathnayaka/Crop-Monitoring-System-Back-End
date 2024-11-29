package com.example.crop_monitoring_backend.entity.impl;

import com.example.crop_monitoring_backend.entity.SuperEntity;
import com.example.crop_monitoring_backend.enums.Designation;
import com.example.crop_monitoring_backend.enums.Gender;
import com.example.crop_monitoring_backend.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "staff")
public class StaffEntity implements SuperEntity {
    @Id
    private String staffId;
    @Column(unique = true)
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
    @Column(unique = true)
    private String email;
    private Role role;
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(
            name = "staffField",
            joinColumns = @JoinColumn(name = "staffId"),
            inverseJoinColumns = @JoinColumn(name = "fieldCode")
    )
    private List<FieldEntity> fields;
    @OneToMany(mappedBy = "staff", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<VehicleEntity> vehicles;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "staffEquipment",
            joinColumns = @JoinColumn(name = "staffId"),
            inverseJoinColumns = @JoinColumn(name = "equipmentId")
    )
    private List<EquipmentEntity> equipment;
    @OneToMany(mappedBy = "staff",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<LogEntity> logs;
}
