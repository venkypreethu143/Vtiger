package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTiger.GenericLibrary.WebDriverLibrary;

public class ContactsPage extends WebDriverLibrary {
	//Declaring
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createContactImage;
	
	//Initialization
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getCreateContactImage() {
		return createContactImage;
	}
	
	//Business Library
	/**
	 * This method will click on Create Contact LookUp Image
	 */
	public void clickOnCreateContactImage() {
		createContactImage.click();
	}
	
	
}
