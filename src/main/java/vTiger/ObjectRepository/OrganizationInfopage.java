package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTiger.GenericLibrary.WebDriverLibrary;

public class OrganizationInfopage extends WebDriverLibrary {
	//Declaration
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement organizationHeaderText;
	
	//Intialization
	public OrganizationInfopage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getOrganizationHeaderText() {
		return organizationHeaderText;
	}
	
	//Business Library
	/**
	 * This method will fetch the Header text and return to its caller
	 * @return
	 */
	public String getOrganizationHeader() {
		return organizationHeaderText.getText();
		
	}

}
