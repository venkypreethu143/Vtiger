package practice;

import org.testng.annotations.Test;

public class UsageOfPriority {
	//All scripts will execute in the prioritized order
	@Test(priority = -1)
	public void createCustomer() {
		System.out.println("Customer Created");//1
	}

	@Test(priority =0)
	public void modifyCustomer() {
		System.out.println("Modify Customer");//2
	}
	
	@Test(priority = 1)
	public void deleteCustomer() {
		System.out.println("Delete Customer");//3
	}
}
