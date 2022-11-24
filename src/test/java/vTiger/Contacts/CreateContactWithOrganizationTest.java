package vTiger.Contacts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import vTiger.GenericLibrary.BaseClass;
import vTiger.ObjectRepository.ContactsInfoPage;
import vTiger.ObjectRepository.ContactsPage;
import vTiger.ObjectRepository.CreateNewContactPage;
import vTiger.ObjectRepository.CreateNewOrganizationPage;
import vTiger.ObjectRepository.HomePage;
import vTiger.ObjectRepository.OrganizationInfopage;
import vTiger.ObjectRepository.OrganizationPage;

@Listeners(vTiger.GenericLibrary.ListenerImplementationLibrary.class)
public class CreateContactWithOrganizationTest extends BaseClass {
	@Test(groups = "regressionSuite")
	public void createContactWithOrgnizationTest() throws IOException {
		
		//Step 1: Read all the Required Data
		String LASTNAME = eLib.readDataFromExcel("contact", 4, 2)+jLib.getRandomNumber();
		String ORGNAME = eLib.readDataFromExcel("organization", 4, 2)+jLib.getRandomNumber();
		String INDUSTRYNAME = eLib.readDataFromExcel("organization", 4, 3);
		
		//Step 2:Navigate to Organization Link
		HomePage hp = new HomePage(driver);
		hp.clickOrganizationLink();
				
		//Step 3: Navigate to Organization Contact LookUp image
		OrganizationPage op = new OrganizationPage(driver);
		op.ClickOnOrganizationImg();
				
		//Step 4:Create Organization with Mandatory details and Save
		CreateNewOrganizationPage cp = new CreateNewOrganizationPage(driver);
		cp.createNewOrganization(ORGNAME, INDUSTRYNAME);
		
		//Step 5:To Validate Organization
		OrganizationInfopage of = new OrganizationInfopage(driver);
		String OrganizationHeader = of.getOrganizationHeader();
		Assert.assertTrue(OrganizationHeader.contains(ORGNAME), "Industry Created Successfully");
		
		//Step 6:Navigate to Contacts Link
		hp.clickContactsLink();
		
		//Step 7: Navigate to create Contact LookUp image
		ContactsPage csp = new ContactsPage(driver);
		csp.clickOnCreateContactImage();
		
		//Step 8:Create Contact with Mandatory details and Save
		CreateNewContactPage cnp = new CreateNewContactPage(driver);
		cnp.createNewContactWithOrganization("Mr.",LASTNAME, ORGNAME, driver);
		
		//Step 9:To Validate Contact
		ContactsInfoPage cip= new ContactsInfoPage(driver);
		String ContactHeader = cip.getContactHeader();
		Assert.assertTrue(ContactHeader.contains(LASTNAME), "Contact with Organization Created Successfully");
	}

}
