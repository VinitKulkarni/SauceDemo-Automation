package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void goinsidecart() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	}
	
	public void checkout() {
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
	}
	

}
