package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTiger.GenericLibrary.WebDriverLibrary;

public class CreateNewOrganizationPage extends WebDriverLibrary {
	//Declaration
	@FindBy(name="accountname")
	private WebElement orgName;
	
	@FindBy(name="industry")
	private WebElement industryType;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	//Initialization
	public CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getIndustryType() {
		return industryType;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	//Business Library
	/**
	 * This method will create new Organization
	 * @param OrgName
	 */
	public void createNewOrganization(String OrgName) {
		orgName.sendKeys(OrgName);
		saveBtn.click();
	}
	
	/**
	 * This method will create new Organization with Industry
	 * @param OrgName
	 * @param IndName
	 */
	public void createNewOrganization(String OrgName, String IndName) {
		orgName.sendKeys(OrgName);
		handleDropDown(IndName, industryType);
		saveBtn.click();
	}
	
	

}
