package com.cg.jpainitialsetup.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Capg_External_Project")
public class ExternalProject extends Project {
	
	private String clientName;

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	

}
