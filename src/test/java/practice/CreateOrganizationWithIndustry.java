package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateOrganizationWithIndustry {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("Testyantra2");
		WebElement ListBox = driver.findElement(By.name("industry"));
		Select option = new Select(ListBox);
		option.selectByVisibleText("Healthcare");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(5000);
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("img[src='themes/softed/images/user.PNG']"))).click().perform();
		actions.moveToElement(driver.findElement(By.linkText("Sign Out"))).click().perform();
	}

}
