package com.cg.pizzaapp.dao;

import java.util.List;

import com.cg.pizzaapp.domain.Pizza;

/**
 * This PizzaDAO will perform all the crud operations for pizza
 * 
 * @author panka
 *
 */
public interface PizzaDAO {
	/**
	 * This save method will save the provided pizza
	 * 
	 * @param pizza to be saved
	 */
	void save(Pizza pizza);

	/**
	 * This will return the list of all pizza available
	 * 
	 * @return list of pizzas if found otherwise null
	 */
	List<Pizza> findAll();

	/**
	 * This will update the pizza detail, as provided
	 * 
	 * @param pizza to be updated
	 */
	void update(Pizza pizza);

	/**
	 * This will delete the pizza based on id
	 * 
	 * @param id
	 */
	void delete(Long id);

	/**
	 * This will delete the pizza based on provided detail
	 * 
	 * @param pizza to be deleted
	 */
	void delete(Pizza pizza);

}
