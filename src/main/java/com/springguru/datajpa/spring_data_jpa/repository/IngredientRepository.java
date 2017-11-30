package com.springguru.datajpa.spring_data_jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.springguru.datajpa.spring_data_jpa.entity.Ingredient;
import com.springguru.datajpa.spring_data_jpa.entity.Recipe;

public interface IngredientRepository extends CrudRepository<Ingredient, Long>{

}
