package genericsWorkShop.business.concretes;

import java.util.List;

import genericsWorkShop.business.abstracts.IEntityService;
import genericsWorkShop.dataAccess.abstracts.IEntityRepository;
import genericsWorkShop.entities.concretes.Product;

public class ProductManager implements IEntityService<Product>{
	
	private IEntityRepository<Product> entityRepository;
	
	public ProductManager(IEntityRepository<Product> entityRepository) {
		this.entityRepository = entityRepository;
	}

	@Override
	public void add(Product entity) {
		entityRepository.add(entity);		
	}

	@Override
	public List<Product> getAll() {
		return entityRepository.getAll();
	}

}
