package genericsWorkShop.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import genericsWorkShop.dataAccess.abstracts.IEntityRepository;
import genericsWorkShop.entities.concretes.Product;

public class ProductDal implements IEntityRepository<Product> {
	
	List<Product> products;
	
	public ProductDal() {
		products = new ArrayList<Product>();
	}

	@Override
	public void add(Product entity) {
		products.add(entity);
		System.out.println("Ürün eklendi : " + entity.getProductName());
	}

	@Override
	public List<Product> getAll() {
		for (Product product : products) {
			System.out.println(product.getId() + product.getProductName() + product.getStockAmount());
		}
		return products;
	}



}
