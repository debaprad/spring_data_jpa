package com.springguru.datajpa.spring_data_jpa;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springguru.datajpa.spring_data_jpa.entity.Recipe;
import com.springguru.datajpa.spring_data_jpa.service.IRecipeService;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner{

	IRecipeService iRecipeService;
	
	public SpringDataJpaApplication(IRecipeService iRecipeService) {
		super();
		this.iRecipeService = iRecipeService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hii");
		Set<Recipe> recipes=iRecipeService.getRecipes();  
		//iRecipeService.getRecipes().forEach(System.out::println);
	}
}
