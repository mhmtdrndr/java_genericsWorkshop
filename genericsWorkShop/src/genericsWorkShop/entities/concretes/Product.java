package genericsWorkShop.entities.concretes;

import genericsWorkShop.entities.abstracts.IEntity;

public class Product implements IEntity {
	
	private int id;
	private String productName; 
	private int stockAmount;
	
	public Product() {
		
	}

	public Product(int id, String productName, int stockAmount) {
		this.id = id;
		this.productName = productName;
		this.stockAmount = stockAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

}
