package net.rmj.spring.model;

import java.util.List;

public class Menu {

	protected Long id;
	protected List<Drink> drinks;
	protected List<Desert> deserts;

	public Menu(Long id, List<Drink> drinks, List<Desert> deserts) {
		super();
		this.id = id;
		this.drinks = drinks;
		this.deserts = deserts;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the drinks
	 */
	public List<Drink> getDrinks() {
		return drinks;
	}

	/**
	 * @param drinks
	 *            the drinks to set
	 */
	public void setDrinks(List<Drink> drinks) {
		this.drinks = drinks;
	}

	/**
	 * @return the deserts
	 */
	public List<Desert> getDeserts() {
		return deserts;
	}

	/**
	 * @param deserts
	 *            the deserts to set
	 */
	public void setDeserts(List<Desert> deserts) {
		this.deserts = deserts;
	}

}
