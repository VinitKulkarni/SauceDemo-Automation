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
import pages.OrderPlacePage;
import pages.ProductsListPage;

public class OrderPlacePageTest extends SauceDemoBaseClass {
	
	LoginPage loginPageObj;
	ProductsListPage productsListPageObj; 
	CartPage cartPageObj;
	AddUserInfoPage addUserInfoPageObj;
	CheckOutOverViewPage checkOutOverViewPageObj;
	OrderPlacePage orderPlacePageObj;
	
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
		checkOutOverViewPageObj.finishBtn();
		
		orderPlacePageObj = new OrderPlacePage(driver);
	}

	
	@Test
	public void complete() throws InterruptedException {
		orderPlacePageObj.orderplacedsuccess();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void close() throws InterruptedException{
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();	
	}

}
