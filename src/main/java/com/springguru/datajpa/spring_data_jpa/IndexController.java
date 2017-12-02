package com.springguru.datajpa.spring_data_jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springguru.datajpa.spring_data_jpa.entity.Category;
import com.springguru.datajpa.spring_data_jpa.entity.Recipe;
import com.springguru.datajpa.spring_data_jpa.repository.CategoryRepository;
import com.springguru.datajpa.spring_data_jpa.repository.UnitOfMessureRepository;
import com.springguru.datajpa.spring_data_jpa.service.IRecipeService;

@Controller
public class IndexController {

	private UnitOfMessureRepository unitOfMessureRepository;
	private CategoryRepository categoryRepository;
	private IRecipeService iRecipeService;
	
	public IndexController(UnitOfMessureRepository unitOfMessureRepository, CategoryRepository categoryRepository,
			IRecipeService iRecipeService) {
		super();
		this.unitOfMessureRepository = unitOfMessureRepository;
		this.categoryRepository = categoryRepository;
		this.iRecipeService = iRecipeService;
	}

	@RequestMapping({"","/","index"})
	public String getIndexPage(Model model)
	{
		model.addAttribute("recipes",iRecipeService.getRecipes());
		 return "index";
	}
	
}
