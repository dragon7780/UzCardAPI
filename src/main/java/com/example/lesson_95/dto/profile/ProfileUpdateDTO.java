package com.example.lesson_95.dto.profile;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ProfileUpdateDTO {
    private String id;
    private String name;
    private String surname;
    private String usernamePassword;
}
