package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverViewPage {
	WebDriver driver;
	
	public CheckOutOverViewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void finishBtn() {
		driver.findElement(By.xpath("//button[@id='finish']")).click();
	}

}
