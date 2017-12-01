package com.springguru.datajpa.spring_data_jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class UnitOfMeasure {
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Lob
	private String description;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUnitOfMesure() {
		return description;
	}
	public void setUnitOfMesure(String unitOfMesure) {
		this.description = unitOfMesure;
	}
	@Override
	public String toString() {
		return "UnitOfMesure [id=" + id + ", description=" + description + "]";
	}
	
	
}
