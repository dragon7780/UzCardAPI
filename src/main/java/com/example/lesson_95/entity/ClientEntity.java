package com.example.lesson_95.entity;

import com.example.lesson_95.enums.GeneralStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "profile")
@Getter
@Setter
public class ClientEntity {
    @Id
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @Column(name = "phone")
    private String phone;
    @Column(name = "status")
    private GeneralStatus status;
    @Column(name = "password_seria")
    private String passwordSeria;
    @Column(name = "password_number")
    private Integer passwordNumber;
}
