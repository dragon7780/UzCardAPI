package com.example.lesson_95.service;

import com.example.lesson_95.dto.profile.ProfileDTO;
import com.example.lesson_95.dto.profile.ProfileUpdateDTO;
import com.example.lesson_95.entity.ProfileEntity;
import com.example.lesson_95.enums.GeneralStatus;
import com.example.lesson_95.enums.ProfileRole;
import com.example.lesson_95.exps.ItemNotFoundException;
import com.example.lesson_95.repository.ProfileRepository;
import com.example.lesson_95.util.MD5Util;
import com.example.lesson_95.util.SpringSecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;
    public ProfileDTO create(ProfileDTO profileDTO){
        ProfileEntity profile=new ProfileEntity();
        profile.setName(profileDTO.getName());
        profile.setSurname(profile.getSurname());
        profile.setUsernamePassword(MD5Util.getMd5Hash(profileDTO.getUserNamePassword()));
        profile.setStatus(GeneralStatus.REGISTER);
        profile.setRole(ProfileRole.ROLE_MODERATOR);
        profileRepository.save(profile);
        return toProfileDTO(profile);
    }
    public void update(ProfileUpdateDTO updateDTO){
        String profileId = SpringSecurityUtil.getProfileId();
        String id=updateDTO.getId();
        ProfileEntity profileEntity = get(id);
        profileEntity.setName(updateDTO.getName());
        profileEntity.setSurname(updateDTO.getSurname());
        profileEntity.setUsernamePassword(MD5Util.getMd5Hash(updateDTO.getUsernamePassword()));
        profileRepository.save(profileEntity);
    }

    public ProfileEntity get(String id){
        Optional<ProfileEntity> byId = profileRepository.findById(id);
        if (byId == null){
            throw new ItemNotFoundException("Item not found");
        }
        return byId.get();
    }
    public ProfileDTO toProfileDTO(ProfileEntity entity){
        ProfileDTO dto=new ProfileDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setRole(entity.getRole());
        dto.setSurname(entity.getSurname());
        dto.setUserNamePassword(entity.getUsernamePassword());
        return dto;
    }
    public Boolean changeStatus(){

        return true;
    }

}
