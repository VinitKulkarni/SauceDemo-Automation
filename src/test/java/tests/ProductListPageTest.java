package tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.SauceDemoBaseClass;
import pages.LoginPage;
import pages.ProductsListPage;

public class ProductListPageTest extends SauceDemoBaseClass{
	
	LoginPage loginPageObj;
	ProductsListPage productsListPageObj; 
	
	@BeforeMethod
	public void start() {
		loginPageObj = new LoginPage(driver);
		loginPageObj.username();
		loginPageObj.password();
		loginPageObj.login();
		
		productsListPageObj = new ProductsListPage(driver);
	}
	
	@Test
	public void addtocart() throws InterruptedException {
		productsListPageObj.addprodtocart();
		Thread.sleep(1000);
	}
	
	@AfterMethod
	public void close() throws InterruptedException{
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();	
	}

}
