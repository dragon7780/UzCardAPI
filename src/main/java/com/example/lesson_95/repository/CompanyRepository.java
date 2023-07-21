package com.example.lesson_95.repository;

import com.example.lesson_95.entity.CompanyEntity;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<CompanyEntity,String> {
}
