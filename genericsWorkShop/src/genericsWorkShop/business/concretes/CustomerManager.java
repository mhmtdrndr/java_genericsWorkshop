package genericsWorkShop.business.concretes;

import java.util.List;

import genericsWorkShop.business.abstracts.IEntityService;
import genericsWorkShop.dataAccess.abstracts.IEntityRepository;
import genericsWorkShop.entities.concretes.Customer;

public class CustomerManager implements IEntityService<Customer> {
	
	private IEntityRepository<Customer> entityRepository;
	
	public CustomerManager(IEntityRepository<Customer> entityRepository) {
		this.entityRepository = entityRepository;
	}

	@Override
	public void add(Customer entity) {
		entityRepository.add(entity);		
	}

	@Override
	public List<Customer> getAll() {
		return entityRepository.getAll();
	}

}
