package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTiger.GenericLibrary.WebDriverLibrary;

public class HomePage extends WebDriverLibrary {
	//Decalring
	@FindBy(linkText="Organizations")
	private WebElement organizationLink;
	
	@FindBy(linkText="Contacts")
	private WebElement contactLink;
	
	@FindBy(linkText="Opportunities")
	private WebElement opportunityLink;
	
	@FindBy(linkText="Products")
	private WebElement productLink;
	
	@FindBy(id="qccombo")
	private WebElement quickCreateLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorImg;

	@FindBy(linkText="Sign Out")
	private WebElement signOutLink;
	
	//Intializing
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getOpportunityLink() {
		return opportunityLink;
	}

	public WebElement getProductLink() {
		return productLink;
	}

	public WebElement getQuickCreateLink() {
		return quickCreateLink;
	}
	public WebElement getAdministratorImg() {
		return administratorImg;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}
	
	//Business library
	/**
	 * This method will click on Organization Link
	 */
	public void clickOrganizationLink() {
		organizationLink.click();
	}
	
	/**
	 * This method will click on contact Link
	 */
	public void clickContactsLink() {
		contactLink.click();
	}
	
	/**
	 * This method will click on QuickCreate dropdown Link
	 */
	public void clickQuickCreateLink() {
		handleDropDown("New Vendor", quickCreateLink);
	
	}
	
	/**
	 * This method will be used to perform signout action
	 * @param driver
	 */
	public void clickOnSignOutlink(WebDriver driver) {
		mouseHoverOn(driver, administratorImg);
		signOutLink.click();
	}
	
	/**
	 * This method will click on products link
	 */
	public void clickOnProductsLink() {
		productLink.click();
	}

	
	

}
