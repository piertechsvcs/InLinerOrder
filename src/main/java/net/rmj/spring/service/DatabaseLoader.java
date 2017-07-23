package net.rmj.spring.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import net.rmj.spring.model.Desert;
import net.rmj.spring.model.Drink;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final DrinkRepository drinkRepo;

	private final DesertRepository dessertRepo;

	@Autowired
	public DatabaseLoader(DrinkRepository drinkRepo, DesertRepository desertRepo) {
		this.drinkRepo = drinkRepo;
		this.dessertRepo = desertRepo;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.dessertRepo.save(new Desert("Chocolate Cookies", "delicious cookies", new String[] { "sugar", "flour" },
				new BigDecimal("0.75")));
		this.drinkRepo.save(
				new Drink("Cafe Latte", "signature coffe", new String[] { "coffee", "sugar" }, new BigDecimal("1.5")));
	}
}