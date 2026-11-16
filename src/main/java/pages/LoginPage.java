package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void username() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	}
	
	public void password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	}
	
	public void login() {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
}
