package com.example.lesson_95.repository;

import com.example.lesson_95.entity.ProfileEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<ProfileEntity,String> {

}
