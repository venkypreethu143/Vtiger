package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTiger.GenericLibrary.WebDriverLibrary;

public class ContactsInfoPage extends WebDriverLibrary {
	//Declaration
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement ContactHeaderText;
	
	//intitalization
	public ContactsInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	//Utilization
	public WebElement getContactHeaderText() {
		return ContactHeaderText;
	}
	
	//Business Library
	
	/**
	 * This method will fetch the Header text and return to its caller
	 * @return
	 */
	public String getContactHeader() {
		return ContactHeaderText.getText();
	}
	
	

}
