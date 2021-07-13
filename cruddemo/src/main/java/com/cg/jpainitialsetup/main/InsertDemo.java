package com.cg.jpainitialsetup.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpainitialsetup.domain.UserDetail;

public class InsertDemo {

	public static void main(String[] args) {
		
		// Suppose you got the data from service layer and this is your DAO layer
		
		UserDetail userDetail = new UserDetail();
		userDetail.setName("Pankaj");
		userDetail.setContact("8827611875");
		
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(userDetail);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		

	}

}
