package com.cg.pizzaapp.util;

import java.util.List;
import java.util.Scanner;

import com.cg.pizzaapp.domain.Pizza;
import com.cg.pizzaapp.service.PizzaService;
import com.cg.pizzaapp.serviceimpl.PizzaServiceImpl;

public class PizzaUtil {
	
	private PizzaService pizzaService;
	
	public PizzaUtil() {
		pizzaService= new PizzaServiceImpl();
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		int choice;
		String continueChoice;
		
		do {
			showMenu();
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Pizza pizza =  new Pizza();
				System.out.println("Enter Pizza Name");
				pizza.setName(sc.next());
				System.out.println("Enter Crust : [Thin, Thick]");
				pizza.setCrust(sc.next());
				System.out.println("Enter Size : [Medium, Regular, Large]");
				pizza.setSize(sc.next());
				pizzaService.order(pizza);
				break;
			case 2:
				System.out.println("------------Pizza Detail--------------");
				List<Pizza> pizzas =  pizzaService.showAllPizzas();
				for (Pizza piz : pizzas) {
					System.out.println(piz);
				}
				break;
			case 0:
				System.exit(1);
				break;

			default:
				System.out.println("Wrong Choice");
				break;
			}
			System.out.println("Do you want to continue : (yes/no) : ");
			continueChoice =  sc.next();
		}while(continueChoice.equalsIgnoreCase("yes"));
		
	}

	private void showMenu() {
		System.out.println("------Pizza Menu-------");
		System.out.println("1. Order Pizza");
		System.out.println("2. Show Pizza List");
		System.out.println("0. Exit");
	}

}

