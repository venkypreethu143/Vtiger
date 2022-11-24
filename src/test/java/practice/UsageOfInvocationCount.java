package practice;

import org.testng.annotations.Test;

public class UsageOfInvocationCount {
	//To execute in the prioritized order and multiple times
	@Test(priority = -1, invocationCount = 3)
	public void createCustomer() {
		System.out.println("Customer Created");
	}

	@Test(priority =0)
	public void modifyCustomer() {
		System.out.println("Modify Customer");
	}
	
	@Test(priority = 1)
	public void deleteCustomer() {
		System.out.println("Delete Customer");
	}
}
