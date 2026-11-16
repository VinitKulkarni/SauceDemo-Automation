package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SauceDemoBaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void inital() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
