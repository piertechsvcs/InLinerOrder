package net.rmj.spring.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.rmj.spring.model.Desert;
import net.rmj.spring.model.Drink;
import net.rmj.spring.model.Menu;
import net.rmj.spring.service.MenuService;

@RestController
public class MenuContoller {

	@Autowired
	MenuService menuService;

	@GetMapping("/menus")
	public List<Menu> getMenus() {
		return menuService.getMenus();
	}

	@GetMapping("/menus/{id}")
	public ResponseEntity<Menu> getMenu(@PathVariable("id") Long id) {
		Menu menu = menuService.getMenu(id);
		if (menu == null) {
			return new ResponseEntity<Menu>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Menu>(menu, HttpStatus.OK);
	}

	@PostMapping(value = "/menus/drinks")
	public ResponseEntity<Drink> addDrink(@RequestBody Drink drink) {
		menuService.createDrink(drink);
		return new ResponseEntity<Drink>(HttpStatus.OK);

	}

	@PostMapping(value = "/menus/deserts")
	public ResponseEntity<Desert> addDesert(@RequestBody Desert desert) {
		menuService.createDesert(desert);
		return new ResponseEntity<Desert>(desert, HttpStatus.OK);

	}

	@GetMapping(value = "/menus/drinks/{id}")
	public ResponseEntity<Drink> getDrink(@PathVariable("id") Long id) {
		Drink drink = menuService.getDrinkById(id);
		if (drink == null) {
			return new ResponseEntity<Drink>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Drink>(drink, HttpStatus.OK);
	}

	@GetMapping(value="/menus/deserts/{id}")
	public ResponseEntity<Desert> getDesert(@PathVariable("id")Long id) {
		Desert desert = menuService.getDesert(id);
		if (desert == null) {
			return new ResponseEntity<Desert>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Desert>(desert, HttpStatus.OK);
	}

	@GetMapping(value = "/menus/drink/{id}")
	public ResponseEntity<Drink> updateDrink(@PathVariable("id") Long id, @RequestBody Drink drink) {

		Drink updated = menuService.updateDrink(drink);
		if (updated == null) {
			return new ResponseEntity<Drink>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Drink>(drink, HttpStatus.OK);
	}


}
