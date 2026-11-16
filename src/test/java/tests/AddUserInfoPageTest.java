package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.SauceDemoBaseClass;
import pages.AddUserInfoPage;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsListPage;

public class AddUserInfoPageTest extends SauceDemoBaseClass {
	LoginPage loginPageObj;
	ProductsListPage productsListPageObj; 
	CartPage cartPageObj;
	AddUserInfoPage addUserInfoPageObj;
	
	@BeforeMethod
	public void start() {
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
	}
	
	@Test
	public void addUserDetails() throws InterruptedException {
		addUserInfoPageObj.adduserdetails();
		Thread.sleep(5000);
	}
}
