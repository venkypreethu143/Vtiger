package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTiger.GenericLibrary.WebDriverLibrary;

public class CreateVendorPage extends WebDriverLibrary {
	//Declaration
	@FindBy(name="vendorname")
	private WebElement venderName;
	
	@FindBy(id="phone")
	private WebElement phoneNumber;
	
	@FindBy(id="email")
	private WebElement emailId;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	//Intialization
	public CreateVendorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getVenderName() {
		return venderName;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getEmailId() {
		return emailId;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	//Business Library
	/**
	 * This Method will create New vendor
	 * @param VENDNAME
	 */
	public void createVendor(String VENDNAME) {
		venderName.sendKeys(VENDNAME);
		saveBtn.click();
	}
}
