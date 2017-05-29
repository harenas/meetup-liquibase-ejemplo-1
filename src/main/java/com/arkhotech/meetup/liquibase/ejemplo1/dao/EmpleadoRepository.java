package com.arkhotech.meetup.liquibase.ejemplo1.dao;

import org.springframework.data.repository.CrudRepository;

import com.arkhotech.meetup.liquibase.ejemplo1.entity.EmpleadoEntity;

public interface EmpleadoRepository extends CrudRepository<EmpleadoEntity, Integer> {

}
