package com.cg.pizzaapp.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.cg.pizzaapp.dao.PizzaDAO;
import com.cg.pizzaapp.domain.Pizza;

public class PizzaDAOImpl implements PizzaDAO{
	
	private List<Pizza> pizzaRepository;
	
	public PizzaDAOImpl() {
		pizzaRepository=new ArrayList<>();
	}

	@Override
	public void save(Pizza pizza) {
		pizzaRepository.add(pizza);
		
	}

	@Override
	public List<Pizza> findAll() {
		
		return pizzaRepository;
	}

	@Override
	public void update(Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

}
