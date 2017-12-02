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

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity	
@Data
@EqualsAndHashCode(exclude= {"recipe"})
public class Ingredient {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Lob
	private String direction;
	private BigDecimal amount;
	@ManyToOne
	private Recipe recipe;
	@OneToOne(fetch=FetchType.EAGER)
	private UnitOfMeasure unitOfMesure;
	
	
	public Ingredient() {
		super();
	}
	public Ingredient(String direction, BigDecimal amount, UnitOfMeasure unitOfMesure) {
		super();
		this.direction = direction;
		this.amount = amount;
		this.unitOfMesure = unitOfMesure;
	}
	
}
