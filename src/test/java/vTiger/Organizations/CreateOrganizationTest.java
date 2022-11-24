package vTiger.Organizations;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import vTiger.GenericLibrary.BaseClass;
import vTiger.ObjectRepository.CreateNewOrganizationPage;
import vTiger.ObjectRepository.HomePage;
import vTiger.ObjectRepository.OrganizationInfopage;
import vTiger.ObjectRepository.OrganizationPage;

@Listeners(vTiger.GenericLibrary.ListenerImplementationLibrary.class)
public class CreateOrganizationTest extends BaseClass {
	@Test(groups = "regressionSuite")
	public void createOrganizationTest() throws IOException {
		
		//Step 1: Read all the Required Data
		String ORGNAME = eLib.readDataFromExcel("organization", 1, 2)+jLib.getRandomNumber();
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
		Assert.assertTrue(OrganizationHeader.contains(ORGNAME), "Organization Created Successfully");
	}

}
