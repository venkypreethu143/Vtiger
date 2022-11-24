package vTiger.Contacts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import vTiger.GenericLibrary.BaseClass;
import vTiger.ObjectRepository.ContactsInfoPage;
import vTiger.ObjectRepository.ContactsPage;
import vTiger.ObjectRepository.CreateNewContactPage;
import vTiger.ObjectRepository.HomePage;

@Listeners(vTiger.GenericLibrary.ListenerImplementationLibrary.class)
public class CreateContactTest extends BaseClass {
	
	@Test(groups = "smokeSuite")
	public void createContactTest() throws IOException {
		
		
		//Step 1: read all the required data
		String LASTNAME = eLib.readDataFromExcel("Contact", 1, 2)+jLib.getRandomNumber();
		
		//Step 2: Navigate to Contacts Link
		HomePage hp = new HomePage(driver);
		hp.clickContactsLink();
		
		//Step 3: Navigate to create Contact Look up image
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateContactImage();
		 
		//Step 4: create contact with mandatory details and save
		CreateNewContactPage ccp = new CreateNewContactPage(driver);
		ccp.createNewContact(LASTNAME);
		
		//Step 5: Validate
		ContactsInfoPage cip = new ContactsInfoPage(driver);
		String contactHeader = cip.getContactHeader();
		Assert.assertTrue(contactHeader.contains(LASTNAME), "Contact Created Successfully");
	}
	@Test(groups = "smokeSuite")
	public void Test1(){
		System.out.println("Demo-1");
		Assert.fail();
	}
	@Test(groups = "regressionSuite")
	public void Test2(){
		System.out.println("Demo-2");
		Assert.fail();
	}
}
		