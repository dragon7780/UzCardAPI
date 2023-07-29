package com.example.lesson_95.dto.jwt;

import com.example.lesson_95.enums.ProfileRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class JwtDTO {
    private String email;
    private ProfileRole role;
}
