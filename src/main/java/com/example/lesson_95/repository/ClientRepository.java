package com.example.lesson_95.repository;

import com.example.lesson_95.entity.ClientEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<ClientEntity,String> {
}
