package genericsWorkShop;

import genericsWorkShop.business.concretes.CustomerManager;
import genericsWorkShop.dataAccess.concretes.CustomerDal;
import genericsWorkShop.entities.concretes.Customer;

/**
 * @author mehmet.derindere
 *
 */

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "Mehmet", "Derindere");
		CustomerManager customerManager = new CustomerManager(new CustomerDal());
		customerManager.add(customer);

		customerManager.getAll();
	}

}
