package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddUserInfoPage {
	WebDriver driver;
	
	public AddUserInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void adduserdetails() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Vinit");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Kulkarni");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("591304");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}

}
