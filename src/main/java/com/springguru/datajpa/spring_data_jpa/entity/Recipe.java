package com.springguru.datajpa.spring_data_jpa.entity;

import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Recipe {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String description;
	private Integer prepTime;
	private Integer cookTime;
	private Integer servTime;
	private String service;
	private String url;
	private String directions;
	
	@Lob
	private Byte[] image;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Notes notes;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="recipe")
	private Set<Ingredient> ingredient;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPrepTime() {
		return prepTime;
	}
	public void setPrepTime(Integer prepTime) {
		this.prepTime = prepTime;
	}
	public Integer getCookTime() {
		return cookTime;
	}
	public void setCookTime(Integer cookTime) {
		this.cookTime = cookTime;
	}
	public Integer getServTime() {
		return servTime;
	}
	public void setServTime(Integer servTime) {
		this.servTime = servTime;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDirections() {
		return directions;
	}
	public void setDirections(String directions) {
		this.directions = directions;
	}
	public Byte[] getImage() {
		return image;
	}
	public void setImage(Byte[] image) {
		this.image = image;
	}
	public Notes getNotes() {
		return notes;
	}
	public void setNotes(Notes notes) {
		this.notes = notes;
	}
	public Set<Ingredient> getIngredient() {
		return ingredient;
	}
	public void setIngredient(Set<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}
	
	
	
	
}