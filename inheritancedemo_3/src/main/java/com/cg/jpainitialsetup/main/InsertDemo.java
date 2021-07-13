package com.cg.jpainitialsetup.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpainitialsetup.domain.ExternalProject;
import com.cg.jpainitialsetup.domain.InternalProject;
import com.cg.jpainitialsetup.domain.Project;

public class InsertDemo {

	public static void main(String[] args) {
		
		// Suppose you got the data from service layer and this is your DAO layer
		
		
		Project project = new Project();
		project.setName("Root Project");
		
		InternalProject internalProject =  new InternalProject();
		internalProject.setName("My Demo Internal Project");
		internalProject.setManagerName("Prashant");
		
		ExternalProject externalProject = new ExternalProject();
		externalProject.setName("My Demo External Project");
		externalProject.setClientName("Arzoo");
		
		
		
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(project);	
		entityManager.persist(internalProject);
		entityManager.persist(externalProject);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		

	}

}
