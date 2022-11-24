package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTiger.GenericLibrary.WebDriverLibrary;

public class ProductsPage extends WebDriverLibrary {
	//Declaration
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement createProductImg;
	
	//Initialization
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getCreateProductImg() {
		return createProductImg;
	}
	
	//Business Library
	/**
	 * This method is used to click on Product Image
	 */
	public void clickOnProductImg() {
		createProductImg.click();
	}
	
	

}
