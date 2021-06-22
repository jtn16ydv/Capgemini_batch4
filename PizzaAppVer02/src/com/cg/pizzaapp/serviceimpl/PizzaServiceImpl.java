package com.cg.pizzaapp.serviceimpl;

import java.util.List;

import com.cg.pizzaapp.dao.PizzaDAO;
import com.cg.pizzaapp.daoimpl.PizzaDAOImpl;
import com.cg.pizzaapp.domain.Pizza;
import com.cg.pizzaapp.service.PizzaService;

public class PizzaServiceImpl implements PizzaService {
	
	private PizzaDAO pizzaDAO;
	
	public PizzaServiceImpl() {
		pizzaDAO=new PizzaDAOImpl();
	}

	@Override
	public void order(Pizza pizza) {
		pizza.setId(System.currentTimeMillis());
		pizzaDAO.save(pizza);
		
	}

	@Override
	public List<Pizza> showAllPizzas() {
		
		return pizzaDAO.findAll();
	}

}
