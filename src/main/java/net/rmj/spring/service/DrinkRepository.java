package net.rmj.spring.service;

import org.springframework.data.repository.CrudRepository;

import net.rmj.spring.model.Drink;

public interface DrinkRepository extends CrudRepository<Drink, Long> {

}
