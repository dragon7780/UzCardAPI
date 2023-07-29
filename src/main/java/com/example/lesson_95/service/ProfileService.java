package com.example.lesson_95.service;

import com.example.lesson_95.dto.ProfileDTO;
import com.example.lesson_95.entity.ProfileEntity;
import com.example.lesson_95.enums.GeneralStatus;
import com.example.lesson_95.enums.ProfileRole;
import com.example.lesson_95.repository.ProfileRepository;
import com.example.lesson_95.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;
    public void create(ProfileDTO profileDTO){
        ProfileEntity profile=new ProfileEntity();
        profile.setName(profileDTO.getName());
        profile.setSurname(profile.getSurname());
        profile.setUsernamePassword(MD5Util.getMd5Hash(profileDTO.getUserNamePassword()));
        profile.setStatus(GeneralStatus.REGISTER);
        profile.setRole(ProfileRole.ROLE_MODERATOR);
        profileRepository.save(profile);
    }
}
