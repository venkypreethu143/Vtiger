package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UsageOfAsserFail {
	//To add dependancy between the methods and fail the test cases if needed
	@Test
	public void createCustomer() {
		System.out.println("Customer Created");
	}

	@Test(dependsOnMethods = "createCustomer")
	public void modifyCustomer() {
		Assert.fail(); 
		System.out.println("Modify Customer");//It will purpousfully fail the script
	}
	
	@Test(dependsOnMethods = { "createCustomer", "modifyCustomer"})
	public void deleteCustomer() {
		System.out.println("Delete Customer");//This script will be skipped bcoz it depends on Modify
	}
}
