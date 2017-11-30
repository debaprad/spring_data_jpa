package com.springguru.datajpa.spring_data_jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.springguru.datajpa.spring_data_jpa.entity.Category;
import com.springguru.datajpa.spring_data_jpa.entity.Recipe;
import com.springguru.datajpa.spring_data_jpa.entity.UnitOfMesure;

public interface UnitOfMessureRepository extends CrudRepository<UnitOfMesure, Long>{

}
