package net.rmj.spring.model;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class MenuItem {
	protected @Id @GeneratedValue Long id;

	protected String name;
	protected String description;
	protected String[] ingredients;
	protected BigDecimal price;

	public MenuItem() {

	}
	public MenuItem(String name, String description, String[] ingredients, BigDecimal price) {
		this.name = name;
		this.description = description;
		this.ingredients = ingredients;
		this.price = price;
	}
	/**
	 * @return the itemId
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param itemId
	 *            the itemId to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the ingredients
	 */
	public String[] getIngredients() {
		return ingredients;
	}

	/**
	 * @param ingredients
	 *            the ingredients to set
	 */
	public void setIngredients(String[] ingredients) {
		this.ingredients = ingredients;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
