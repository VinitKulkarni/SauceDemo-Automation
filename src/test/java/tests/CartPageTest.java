package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.SauceDemoBaseClass;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsListPage;

public class CartPageTest extends SauceDemoBaseClass {
	
	LoginPage loginPageObj;
	ProductsListPage productsListPageObj; 
	CartPage cartPageObj;
	
	@BeforeMethod
	public void start() {
		loginPageObj = new LoginPage(driver);
		loginPageObj.username();
		loginPageObj.password();
		loginPageObj.login();
		
		productsListPageObj = new ProductsListPage(driver);
		productsListPageObj.addprodtocart();
		
		cartPageObj = new CartPage(driver);
	}
	
	@Test
	public void carttocheckout() throws InterruptedException {
		cartPageObj.goinsidecart();
		cartPageObj.checkout();
		Thread.sleep(5000);
	}

}
