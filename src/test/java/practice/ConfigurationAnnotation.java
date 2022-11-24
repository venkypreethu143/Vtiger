package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
	@BeforeClass
	public void bcConfiguration() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void bmConfiguration() {
		System.out.println("Before Method");
	}
	
	@BeforeTest
	public void btConfiguration() {
		System.out.println("Before Test");
	}
	
	@BeforeSuite
	public void bsConfiguration() {
		System.out.println("Before Suite");
	}
	
	@AfterClass
	public void acConfiguration() {
		System.out.println("After Class");
	}
	
	@AfterMethod
	public void amConfiguration() {
		System.out.println("After Method");
	}
	
	@AfterTest
	public void atConfiguration() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void asConfiguration() {
		System.out.println("After Suite");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}

}
