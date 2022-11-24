package practice;

import org.testng.annotations.Test;

public class UsageOfDependancy {
	//To add dependancy between the methods
	@Test
	public void createCustomer() {
		System.out.println("Customer Created");
	}

	@Test(dependsOnMethods = "createCustomer")
	public void modifyCustomer() {
		System.out.println("Modify Customer");
	}
	
	@Test(dependsOnMethods = { "createCustomer", "modifyCustomer"})
	public void deleteCustomer() {
		System.out.println("Delete Customer");
	}
}
