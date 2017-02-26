package net.rmj.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.rmj.spring.model.Desert;
import net.rmj.spring.model.Drink;
import net.rmj.spring.model.Menu;

/**
 * Menu service provides access to the implementation of menu dao
 * 
 * @author rmjoh
 *
 */
@Component
public class MenuService {

	@Autowired
	MenuDAO menuDAO;
	
	public List<Menu> getMenus() {
		return menuDAO.getMenus();
	}
	
	public Menu getMenu(Long id) {
		return menuDAO.getMenu(id);
	}
	
	public List<Drink> getDrinks() {
		return menuDAO.getDrinks();
	}
	public Long createDrink(Drink drink) {
		return menuDAO.addDrink(drink);
	}
	
	public Drink updateDrink(Drink drink) {
		return menuDAO.updateDrink(drink);
	}
	
	public Drink getDrinkById(Long id) {
	
		return menuDAO.findDrinkById(id);
	}
	
	public Drink getDrinkByName(String name) {
		return menuDAO.findDrinkByName(name);
	}
	
	public Long deleteDrink(Long id) {

		return null;
	}

	public List<Desert> getDeserts() {
		return menuDAO.getDeserts();
	}
	
	public Desert getDesert(Long id) {
		return menuDAO.findDesertById(id);
	}

	public Long createDesert(Desert desert) {
		return menuDAO.addDesert(desert);
	}
	
	public Desert updateDesert(Desert desert) {
		return menuDAO.updateDesert(desert);
	}

}
