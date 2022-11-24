package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VenderInfoPage {
	//Declaration
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement VenderHeaderText;
	
	//Intialization
	public VenderInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getVenderHeaderText() {
		return VenderHeaderText;
	}
	
	//Business Library
	/**
	 * This method will fetch Vendor Header Text
	 * @return
	 */
	public String getVenderHeader() {
		return VenderHeaderText.getText();
	}
}
