package vTiger.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTiger.GenericLibrary.WebDriverLibrary;

public class CreateProductPage extends WebDriverLibrary {
	//Declaration
	@FindBy(name="productname")
	private WebElement productName;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement clickOnVendorImg;
	
	@FindBy(name="search_text")
	private WebElement searchVendor;
	
	@FindBy(name="search")
	private WebElement searchBtn;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	//Intialization
	public CreateProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getProductName() {
		return productName;
	}

	public WebElement getClickOnVendorImg() {
		return clickOnVendorImg;
	}

	public WebElement getSearchVendor() {
		return searchVendor;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	//Business Library
	/**
	 * This methos will create new product
	 * @param PRODNAME
	 */
	public void createProduct(String PRODNAME) {
		productName.sendKeys(PRODNAME);
		saveBtn.click();
	}
	
	/**
	 * This methos will create new product with vendor
	 * @param PRODNAME
	 * @param driver
	 * @param VENDNAME
	 */
	public void createProduct(String PRODNAME, WebDriver driver, String VENDNAME) {
		productName.sendKeys(PRODNAME);
		clickOnVendorImg.click();
		switchToWindow(driver, "Vendors");
		searchVendor.sendKeys(VENDNAME);
		searchBtn.click();
		driver.findElement(By.xpath("//a[text()='"+VENDNAME+"']")).click();
		switchToWindow(driver, "Products");
		saveBtn.click();
		
	}
	
	

}
