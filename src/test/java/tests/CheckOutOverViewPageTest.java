package tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.SauceDemoBaseClass;
import pages.AddUserInfoPage;
import pages.CartPage;
import pages.CheckOutOverViewPage;
import pages.LoginPage;
import pages.ProductsListPage;

public class CheckOutOverViewPageTest extends SauceDemoBaseClass {
	
	LoginPage loginPageObj;
	ProductsListPage productsListPageObj; 
	CartPage cartPageObj;
	AddUserInfoPage addUserInfoPageObj;
	CheckOutOverViewPage checkOutOverViewPageObj;
	
	@BeforeMethod
	public void start() throws InterruptedException {
		loginPageObj = new LoginPage(driver);
		loginPageObj.username();
		loginPageObj.password();
		loginPageObj.login();
		
		
		productsListPageObj = new ProductsListPage(driver);
		productsListPageObj.addprodtocart();
		
		
		cartPageObj = new CartPage(driver);
		cartPageObj.goinsidecart();
		cartPageObj.checkout();
		
		addUserInfoPageObj = new AddUserInfoPage(driver);
		addUserInfoPageObj.adduserdetails();
		
		checkOutOverViewPageObj = new CheckOutOverViewPage(driver);
	}
	
	
	@Test
	public void finish() throws InterruptedException {
		checkOutOverViewPageObj.finishBtn();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void close() throws InterruptedException{
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();	
	}

}
