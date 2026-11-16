package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OrderPlacePage {
	
	WebDriver driver;
	
	public OrderPlacePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void orderplacedsuccess() {
		String successMsg = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']")).getText();
		System.out.println(successMsg);
	}

}
