package vTiger.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTiger.GenericLibrary.WebDriverLibrary;

public class CreateNewContactPage extends WebDriverLibrary {
	//Declaring
	@FindBy(name="salutationtype")
	private WebElement firstNameEdt;
	
	@FindBy(name="lastname")
	private WebElement lastNameEdt;
	
	@FindBy(name="leadsource")
	private WebElement leadSourceDropDown;
	
	@FindBy(xpath="//input[@name='account_id']/following-sibling::img[@alt='Select']")
	private WebElement organizationImg;
	
	@FindBy(name="search_text")
	private WebElement searchEtd;
	
	@FindBy(name="search")
	private WebElement searchBtn;
	
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	//Intialization
	public CreateNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getFirstNameNameEdt() {
		return firstNameEdt;
	}
	
	public WebElement getLastNameEdt() {
		return lastNameEdt;
	}

	public WebElement getLeadSourceDropDown() {
		return leadSourceDropDown;
	}

	public WebElement getOrganizationImg() {
		return organizationImg;
	}

	public WebElement getSearchEtd() {
		return searchEtd;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	//Business Library
	
	/**
	 * This method will create new contact with last name
	 * @param lastname
	 */
	public void createNewContact(String lastname) {
		lastNameEdt.sendKeys(lastname);
		saveBtn.click();
	}
	
	/**
	 * This method will create new contact with lead Source DropDown
	 * @param lastname
	 * @param leadSourceValue
	 */
	public void createNewContact(String lastname, String firstName, String leadSourceValue) {
		handleDropDown(firstNameEdt, firstName);
		lastNameEdt.sendKeys(lastname);
		handleDropDown(leadSourceDropDown, leadSourceValue);
		saveBtn.click();
		
	}
	
	/**
	 * This method will create new contact with Organization
	 * @param lastname
	 * @param OrgName
	 * @param driver
	 */
	public void createNewContactWithOrganization(String firstName, String lastname, String OrgName, WebDriver driver) {
		handleDropDown(firstNameEdt, firstName);
		lastNameEdt.sendKeys(lastname);
		organizationImg.click();
		switchToWindow(driver, "Accounts");
		searchEtd.sendKeys(OrgName);
		searchBtn.click();
		driver.findElement(By.xpath("//a[text()='"+OrgName+"']")).click();
		switchToWindow(driver, "Contacts");
		saveBtn.click();
		
	}
}
