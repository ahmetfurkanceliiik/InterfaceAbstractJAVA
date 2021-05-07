package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entites.Customer;



public class StarbucksCustomerManager extends BaseCustomerManager  {

	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService){
		this.customerCheckService = customerCheckService;
	}
		
	public void save(Customer customer)
	{	
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);	
		}
		else {
			System.out.println("Bilgiler uyu�muyor hatal� bilgi girdiniz!");
		}
	}
}
