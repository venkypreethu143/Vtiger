package practice;

import org.testng.annotations.Test;

public class UsageOfEnableEqulsToFalse {
	@Test
	public void createCustomer() {
		System.out.println("Customer Created");
	}

	@Test(enabled = false)//(invocationCount=0), @Ignore
	public void modifyCustomer() {
		System.out.println("Modify Customer");// it will not consider the script for execution
	}
	
	@Test
	public void deleteCustomer() {
		System.out.println("Delete Customer");
	}
}
