package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTiger.GenericLibrary.WebDriverLibrary;

//Rule 1: Create a Separate Java Class for Every WebPage
public class LoginPage extends WebDriverLibrary {
	
	//Rule 2: Identify the WebElements using @FindBy, @FindAll @FindBys Annotations
	@FindBy(name="user_name")
	private WebElement userNameEdt;
	
	@FindAll({@FindBy(name="user_password"), @FindBy(xpath="//input[@name='user_password']")})
	private WebElement passwordEdt;
	
	//@FindBys({@FindBy(name="user_password"), @FindBy(xpath="//input[@name='user_password']")})
	//private WebElement passwordEdt;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	//Rule 3: Create the constructor to intialize the WebElements
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule 4: Private getter() To access These private data members
	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	//Rule 5: Create Business Library
	/**
	 * This method will perform Login Operation
	 * @param username
	 * @param password
	 */
	public void loginToApp(String username, String password)
	{
		userNameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}

}
