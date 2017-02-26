package net.rmj.spring.model;

import java.math.BigDecimal;

public class Desert extends MenuItem {

	private String name;
	private String description;
	private String[] ingredients;
	private BigDecimal price;

	public Desert(Long id, String name, String description, String[] ingredients, BigDecimal price) {
		this.itemId = id;
		this.name = name;
		this.description = description;
		this.ingredients = ingredients;
		this.price = price;
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
