package Concrete;

import Abstract.ICustomerCheckService;
import Entites.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true; 
		
	}

}
