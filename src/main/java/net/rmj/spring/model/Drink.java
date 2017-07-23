package net.rmj.spring.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class Drink extends MenuItem {

	public Drink() {

	}
	public Drink(String name, String description, String[] ingredients, BigDecimal price) {
		super(name, description, ingredients, price);
	}


}
