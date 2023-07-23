package com.example.lesson_95.entity;

import com.example.lesson_95.enums.GeneralStatus;
import com.example.lesson_95.enums.ProfileRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "profile")
@Getter
@Setter
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    private ProfileRole role;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private GeneralStatus status;
    @Column(name = "visible")
    private Boolean visible = Boolean.TRUE;
    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();
    @Column(name = "username_password")
    private String usernamePassword;
}
