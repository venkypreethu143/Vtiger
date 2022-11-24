package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTiger.GenericLibrary.WebDriverLibrary;

public class OrganizationPage extends WebDriverLibrary {
	
	//Declaration
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement organizationImg;
	
	//Initialization
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getOrganizationImg() {
		return organizationImg;
	}
	
	//Business Library
	/**
	 * This method will click on Create Organization LookUp Image
	 */
	public void ClickOnOrganizationImg() {
		organizationImg.click();
	}

}
