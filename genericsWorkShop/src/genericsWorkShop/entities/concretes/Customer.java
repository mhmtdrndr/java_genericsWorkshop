package genericsWorkShop.entities.concretes;

import genericsWorkShop.entities.abstracts.IEntity;

public class Customer implements IEntity {
	private int id;
	private String firtsName;
	private String lastName;
	
	public Customer() {
		
	}

	public Customer(int id, String firtsName, String lastName) {
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	

}
