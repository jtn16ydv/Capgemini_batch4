package com.cg.jpainitialsetup.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpainitialsetup.domain.Address;
import com.cg.jpainitialsetup.domain.UserDetail;

public class InsertDemo {

	public static void main(String[] args) {
		
		// Suppose you got the data from service layer and this is your DAO layer
		
		UserDetail userDetail = new UserDetail();
		userDetail.setName("Pankaj");
		userDetail.setContact("8827611875");
		
		Address homeAddress = new Address();
		homeAddress.setHouseNo("168");
		homeAddress.setCity("Indore");
		homeAddress.setState("MP");
		homeAddress.setZip("452020");
		
		Address officeAddress = new Address();
		officeAddress.setHouseNo("16CIT");
		officeAddress.setCity("Indore");
		officeAddress.setState("MP");
		officeAddress.setZip("452020");
		
		userDetail.getAddresses().add(homeAddress);
		userDetail.getAddresses().add(officeAddress);
		
		
		
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(userDetail);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		

	}

}
