package com.springguru.datajpa.spring_data_jpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springguru.datajpa.spring_data_jpa.entity.Category;
import com.springguru.datajpa.spring_data_jpa.repository.CategoryRepository;
import com.springguru.datajpa.spring_data_jpa.repository.UnitOfMessureRepository;

@Controller
public class IndexController {

	private UnitOfMessureRepository unitOfMessureRepository;
	private CategoryRepository categoryRepository;
	
	
	public IndexController(UnitOfMessureRepository unitOfMessureRepository, CategoryRepository categoryRepository) {
		super();
		this.unitOfMessureRepository = unitOfMessureRepository;
		this.categoryRepository = categoryRepository;
	}


	@RequestMapping({"","/","index"})
	public String getIndexPage()
	{
		System.out.println(unitOfMessureRepository.findByDescription("Teaspoon").get());
		System.out.println(categoryRepository.findByDescription("Americanss").
				orElse(new Category()));
		 return "index";
	}
	
}
