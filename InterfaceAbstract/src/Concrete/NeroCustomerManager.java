package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entites.Customer;


public class NeroCustomerManager extends BaseCustomerManager {
	ICustomerCheckService customerCheckService;
	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	
	public void save(Customer customer) {
		{	
			if(customerCheckService.CheckIfRealPerson(customer)) {
				super.save(customer);	
			}
			else {
				System.out.println("Bilgiler uyuþmuyor hatalý bilgi girdiniz!");
			}
		}
	}
	

	

	

}
