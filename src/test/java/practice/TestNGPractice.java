package practice;

import org.testng.annotations.Test;

public class TestNGPractice {
	//All scripts will execute in the Alphabatical order
	@Test
	public void createCustomer() {
		System.out.println("Customer Created");//1
	}

	@Test
	public void modifyCustomer() {
		System.out.println("Modify Customer");//3
	}
	
	@Test
	public void deleteCustomer() {
		System.out.println("Delete Customer");//2
	}
}
