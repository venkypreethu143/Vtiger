package vTiger.Products;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import vTiger.GenericLibrary.BaseClass;
import vTiger.ObjectRepository.CreateProductPage;
import vTiger.ObjectRepository.CreateVendorPage;
import vTiger.ObjectRepository.HomePage;
import vTiger.ObjectRepository.ProductInfoPage;
import vTiger.ObjectRepository.ProductsPage;
import vTiger.ObjectRepository.VenderInfoPage;

@Listeners(vTiger.GenericLibrary.ListenerImplementationLibrary.class)
public class CreateProductWithVenderNameTest extends BaseClass {
	 @Test(groups = "smokeSuite")
	public void createProductWithVenderNameTest() throws IOException{

		//Step 1: Read all the Required Data
		String PRODNAME = eLib.readDataFromExcel("Product", 4, 2)+jLib.getRandomNumber();
		String VENDNAME = eLib.readDataFromExcel("Product", 4, 3)+jLib.getRandomNumber();
		
		//Step 2:Navigate to QuickCreateLink
		HomePage hp = new HomePage(driver);
		hp.clickQuickCreateLink();
		
		//Step 3: Create Vendor
		CreateVendorPage cv = new CreateVendorPage(driver);
		cv.createVendor(VENDNAME);
		
		//Step 4:Validate Vendor
		VenderInfoPage vp = new VenderInfoPage(driver);
		String VendorHeader = vp.getVenderHeader();
		Assert.assertTrue(VendorHeader.contains(VENDNAME), "Vendor Created Successfully");
		
		//Step 5:Navigate to Products Link
		hp.clickOnProductsLink();
		
		//Step 6: Navigate to create Product LookUp image
		ProductsPage pp = new ProductsPage(driver);
		pp.clickOnProductImg();
		
		//Step 7:Create Product with Mandatory details and Save
		CreateProductPage cpp = new CreateProductPage(driver);
		cpp.createProduct(PRODNAME, driver, VENDNAME);
		
		//Step 8:To Validate Product
		ProductInfoPage pip = new ProductInfoPage(driver);
		String ProductHeader = pip.getProductHeader();
		Assert.assertTrue(ProductHeader.contains(PRODNAME), "Product Created Successfully");
	}


}
