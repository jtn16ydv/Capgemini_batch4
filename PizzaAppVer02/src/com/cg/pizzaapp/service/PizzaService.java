package com.cg.pizzaapp.service;

import java.util.List;

import com.cg.pizzaapp.domain.Pizza;

/**
 * This Interface will perform all the service for pizza
 * @author panka
 *
 */
public interface PizzaService {

	 void order(Pizza pizza);
	 List<Pizza> showAllPizzas();
}
