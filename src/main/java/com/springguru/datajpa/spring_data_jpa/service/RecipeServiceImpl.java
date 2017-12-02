package com.springguru.datajpa.spring_data_jpa.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.springguru.datajpa.spring_data_jpa.entity.Recipe;
import com.springguru.datajpa.spring_data_jpa.repository.RecipeRepository;

@Service
public class RecipeServiceImpl implements IRecipeService{

	RecipeRepository recipeRepository;
	
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;
	}

	@Override
	public Set<Recipe> getRecipes() {
		Set<Recipe> recipes=new HashSet<>();
		recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
		return recipes;
	}

}
