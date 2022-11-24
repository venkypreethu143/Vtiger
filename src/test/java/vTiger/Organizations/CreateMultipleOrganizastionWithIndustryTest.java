package vTiger.Organizations;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import vTiger.GenericLibrary.BaseClass;
import vTiger.ObjectRepository.CreateNewOrganizationPage;
import vTiger.ObjectRepository.HomePage;
import vTiger.ObjectRepository.OrganizationInfopage;
import vTiger.ObjectRepository.OrganizationPage;

@Listeners(vTiger.GenericLibrary.ListenerImplementationLibrary.class)
public class CreateMultipleOrganizastionWithIndustryTest extends BaseClass {

	@Test(dataProvider = "MultipleOrganizations")
	public void createMultipleOrgTest(String orgName, String indType) throws IOException
	{
		String Org = orgName+jLib.getRandomNumber();

				//Step 1: Navigate to Organizations link
				HomePage hp = new HomePage(driver);
				hp.clickOrganizationLink();
				
				//Step 2: Navigate to create Organizations look up image
				OrganizationPage op = new OrganizationPage(driver);
				op.ClickOnOrganizationImg();
				
				//Step 3: Create new organization and save
				CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
				cnop.createNewOrganization(Org, indType); //failed - exception
				
				//Step 4: Validate
				OrganizationInfopage oip = new OrganizationInfopage(driver);
				String orgHeader = oip.getOrganizationHeader();
				Assert.assertTrue(orgHeader.contains(orgName), "Organization Created Successfully");
	}

	@DataProvider(name = "MultipleOrganizations")
	public Object[][] getData() throws EncryptedDocumentException, IOException {
		
		Object[][] data = eLib.readMultipleData("MultipleOrganization");
		
		return data;

	}

}
