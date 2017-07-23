package net.rmj.spring.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class Desert extends MenuItem {

	public Desert() {

	}
	public Desert(String name, String description, String[] ingredients, BigDecimal price) {
		super(name, description, ingredients, price);
	}

	
}
