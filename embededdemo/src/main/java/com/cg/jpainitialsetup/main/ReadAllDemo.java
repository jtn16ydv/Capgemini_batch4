package com.cg.jpainitialsetup.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.jpainitialsetup.domain.UserDetail;

public class ReadAllDemo {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Query query =  entityManager.createQuery("from UserDetail");
		List<UserDetail> users =  query.getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
		for (UserDetail userDetail : users) {
			System.out.println(userDetail.getName()+": "+userDetail.getAddress());
		}

	}

}
