package tests;


import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.SauceDemoBaseClass;
import pages.LoginPage;

public class LoginPageTest extends SauceDemoBaseClass{
	
	LoginPage loginPageObj;
	
	@BeforeMethod
	public void start() {
		loginPageObj = new LoginPage(driver);
	}
	
	@Test
	public void login() throws InterruptedException {
		loginPageObj.username();
		loginPageObj.password();
		loginPageObj.login();
	}
	
	@AfterMethod
	public void close() {
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	}

}
