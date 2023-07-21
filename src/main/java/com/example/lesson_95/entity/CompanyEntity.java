package com.example.lesson_95.entity;

import com.example.lesson_95.enums.CompanyRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "company")
public class CompanyEntity {
    @Id
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "contact")
    private String contact;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @Column(name = "visible")
    private Boolean visible=Boolean.FALSE;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    private CompanyRole role;
    @Column(name = "bank_code")
    private Integer bankCode;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
}
