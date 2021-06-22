package com.cg.pizzaapp.domain;

/**
 * This Pizza class will be working as a model that will travel data from layer
 * to layer
 * 
 * @author panka
 *
 */
public class Pizza {

	/**
	 * id of the pizza, auto generated
	 */
	private Long id;
	/**
	 * name of the pizza
	 */
	private String name;
	/**
	 * price of the pizza, This will be calculated as final price, including GST and
	 * all other service tax
	 */
	private double price;
	/**
	 * crust of the pizza, can be out of three only ( Thin, Thick)
	 */
	private String crust;
	/**
	 * Size of the pizza, can be out of these (Medium, Regular, Large)
	 */
	private String size;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", name=" + name + ", crust=" + crust + ", size=" + size + "]";
	}
	
	

}
