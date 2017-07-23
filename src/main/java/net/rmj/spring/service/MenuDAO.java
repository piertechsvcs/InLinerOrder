package net.rmj.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import net.rmj.spring.model.Desert;
import net.rmj.spring.model.Drink;
import net.rmj.spring.model.Menu;

@Component
public class MenuDAO {

	List<Drink> drinks;
	List<Desert> deserts;
	private static List<Menu> menus = new ArrayList<Menu>();
	{
		/*
		 * drinks = new ArrayList<Drink>(); drinks.add(new Drink(new Long(1),
		 * "Pepsi", new BigDecimal(1.5), "soft drink", "sugar")); drinks.add(new
		 * Drink(new Long(2), "Coffee", new BigDecimal(2.00), "hot or cold",
		 * "coffee")); drinks.add(new Drink(new Long(3), "Bottled Water", new
		 * BigDecimal(2.5), "water", "water")); drinks.add(new Drink(new
		 * Long(4), "Banana Smoothie", new BigDecimal(3.5), "smoothie",
		 * "sugar, banana"));
		 * 
		 * deserts = new ArrayList<Desert>(); deserts.add(new Desert(new
		 * Long(11), "Chocolate Chip Cookie", "cookie", null, new
		 * BigDecimal(0.99))); deserts.add(new Desert(new Long(12),
		 * "Sugar Cookie", "cookie", null, new BigDecimal(0.99)));
		 * deserts.add(new Desert(new Long(13), "Banana Loaf bread",
		 * "banana bread", null, new BigDecimal(1.99))); deserts.add(new
		 * Desert(new Long(14), "Cinammon Rolls", "cinammon roll", null, new
		 * BigDecimal(2.99)));
		 * 
		 * menus.add(new Menu(new Long(1), drinks, deserts));
		 */
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public Menu getMenu(Long id) {
		for (Menu m : menus) {
			if (m.getId().equals(id)) {
				return m;
			}
		}
		return null;
	}

	public List<Drink> getDrinks() {
		return menus.get(0).getDrinks();
	}

	public List<Desert> getDeserts() {
		return menus.get(0).getDeserts();
	}

	public Long addDrink(Drink drink) {
		// drink.setItemId(System.currentTimeMillis());
		// drinks.add(drink);
		// return drink.getItemId();
		return null;

	}
	
	public Long addDesert(Desert desert) {
		/*
		 * desert.setItemId(System.currentTimeMillis()); deserts.add(desert);
		 * return desert.getItemId();
		 */
		return null;
	}

	public Drink findDrinkById(Long id) {
		/*
		 * for (Drink d : drinks) { if (d.getItemId().equals(id)) { return d; }
		 * }
		 */
		
		return null;
	}

	public Drink findDrinkByName(String name) {
		/*
		 * for (Drink d : drinks) { if (d.getName().equalsIgnoreCase(name)) {
		 * return d; } }
		 */

		return null;
	}
	
	public Drink updateDrink(Drink drink) {

		/*
		 * for (Drink d : drinks) { if (d.getItemId().equals(drink.getItemId()))
		 * { drinks.remove(d); drinks.add(drink); return drink; } }
		 */

		return null;
	}

	public Desert updateDesert(Desert desert) {

		/*
		 * for (Desert d : deserts) { if
		 * (d.getItemId().equals(desert.getItemId())) { deserts.remove(d);
		 * deserts.add(desert); return desert; } }
		 */

		return null;
	}

	public Desert findDesertById(Long id) {
		/*
		 * for (Desert d : deserts) { if (d.getItemId().equals(id)) {
		 * 
		 * return d; } }
		 */

		return null;
	}

}
