package com.springguru.datajpa.spring_data_jpa.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity	
public class Ingredient {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String description;
	private BigDecimal amount;
	@ManyToOne
	private Recipe recipe;
	
	@OneToOne
	private UnitOfMesure unitOfMesure;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public UnitOfMesure getUnitOfMesure() {
		return unitOfMesure;
	}
	public void setUnitOfMesure(UnitOfMesure unitOfMesure) {
		this.unitOfMesure = unitOfMesure;
	}
	
	
	
}
