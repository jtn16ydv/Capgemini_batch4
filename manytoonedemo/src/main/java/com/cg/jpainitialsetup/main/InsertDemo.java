package com.cg.jpainitialsetup.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpainitialsetup.domain.Employee;
import com.cg.jpainitialsetup.domain.Project;

public class InsertDemo {

	public static void main(String[] args) {
		
		// Suppose you got the data from service layer and this is your DAO layer
		
		
		
		Project jeeTraining = new Project();
		jeeTraining.setName("JEE Training");
		jeeTraining.setDuration(3);
		
		Project ilt = new Project();
		ilt.setName("Cloud Computing using AWS");
		ilt.setDuration(1);
		
		Employee employee= new Employee();
		employee.setName("Pankaj");
		
		employee.getProjects().add(jeeTraining);
		employee.getProjects().add(ilt);
		
		jeeTraining.setEmployee(employee);
		ilt.setEmployee(employee);
		
		
		
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.persist(jeeTraining);
		entityManager.persist(ilt);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		

	}

}
