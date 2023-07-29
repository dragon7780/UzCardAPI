package com.example.lesson_95.dto;

import com.example.lesson_95.enums.ProfileRole;
import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfileDTO {
    private String name;
    private String surname;
    private String userNamePassword;
    private ProfileRole role;

}
