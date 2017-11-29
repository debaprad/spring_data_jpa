package com.springguru.datajpa.spring_data_jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.springguru.datajpa.spring_data_jpa.entity.Notes;
import com.springguru.datajpa.spring_data_jpa.entity.Recipe;

public interface NotesRepository extends CrudRepository<Notes, Long>{

}
