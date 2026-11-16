package base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SauceDemoBaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void inital() {
		ChromeOptions options = new ChromeOptions();

        // 1. Disable Password Saving and Autofill prompts
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("autofill.profile_enabled", false);

        // 2. Disable password leak detection warnings
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);

        // Optional: Disable infobars like "Chrome is being controlled by automated test software"
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        // Initialize driver with options
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
