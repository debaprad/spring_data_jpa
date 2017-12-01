package com.springguru.datajpa.spring_data_jpa.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity	
public class Ingredient {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Lob
	private String direction;
	private BigDecimal amount;
	@ManyToOne
	private Recipe recipe;
	
	
	
	public Ingredient() {
		super();
	}
	public Ingredient(String description, BigDecimal amount ,UnitOfMeasure unitOfMesure, Recipe recipe) {
		super();
		this.direction = description;
		this.amount = amount;
		this.recipe = recipe;
		this.unitOfMesure = unitOfMesure;
	}
	@OneToOne(fetch=FetchType.EAGER)
	private UnitOfMeasure unitOfMesure;



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Recipe getRecipe() {
		return recipe;
	}
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	public UnitOfMeasure getUnitOfMesure() {
		return unitOfMesure;
	}
	public void setUnitOfMesure(UnitOfMeasure unitOfMesure) {
		this.unitOfMesure = unitOfMesure;
	}
	

	
	
	
}
