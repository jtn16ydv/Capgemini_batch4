package com.cg.jpainitialsetup.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpainitialsetup.domain.UserDetail;

public class UpdateDemo {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		UserDetail user = entityManager.find(UserDetail.class, 9);
		user.setName("Manvi Sharma");
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		

	}

}
