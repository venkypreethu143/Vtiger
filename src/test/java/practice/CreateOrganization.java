package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOrganization {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Actions actions=new Actions(driver);
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("Testyantra1");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(5000);
		actions.moveToElement(driver.findElement(By.xpath("img[src='themes/softed/images/user.PNG']"))).click().perform();
		actions.moveToElement(driver.findElement(By.linkText("Sign Out"))).click().perform();
	}

}
