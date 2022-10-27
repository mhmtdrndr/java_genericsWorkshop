package genericsWorkShop.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import genericsWorkShop.dataAccess.abstracts.IEntityRepository;
import genericsWorkShop.entities.concretes.Customer;

public class CustomerDal implements IEntityRepository<Customer> {
	
	List<Customer> customers;
	
	public CustomerDal() {
		customers = new ArrayList<Customer>();		
	}

	@Override
	public void add(Customer entity) {
		customers.add(entity);
		System.out.println("Müşteri eklendi : " + entity.getFirtsName());
	}

	@Override
	public List<Customer> getAll() {
		for (Customer customer:customers) {
			System.out.println(customer.getId() + customer.getFirtsName() + customer.getLastName());
		}
		return customers;
	}



}
