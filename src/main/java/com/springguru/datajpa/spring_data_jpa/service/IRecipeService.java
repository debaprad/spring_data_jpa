package com.springguru.datajpa.spring_data_jpa.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.springguru.datajpa.spring_data_jpa.entity.Recipe;

public interface IRecipeService {

	Set<Recipe> getRecipes();
}
