package com.springguru.datajpa.spring_data_jpa.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.springguru.datajpa.spring_data_jpa.entity.Category;
import com.springguru.datajpa.spring_data_jpa.entity.Recipe;

public interface CategoryRepository extends CrudRepository<Category, Long>{

	Optional<Category> findByDescription(String description);
}
