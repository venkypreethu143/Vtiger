package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInfoPage {
	//Declaration
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement productHeaderText;

	//Intitialization
	public ProductInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getProductHeaderText() {
		return productHeaderText;
	}
	
	//Business Library
	/**
	 * This method will return Product HeaderText
	 * @return
	 */
	public String getProductHeader() {
		return productHeaderText.getText();
	}
}
