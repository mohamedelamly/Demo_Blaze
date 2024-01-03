package wep_pages_test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wep_pages.CartPage;
import wep_pages.ProductPage;

public class CartTest extends BaseTest {
	CartPage cart;
	ProductPage productPage ;
  @Test
  public void verifyCart() {
	  Assert.assertEquals(cart.getProductName(),ProductPage.productNameItem );
  }
  @BeforeClass
  public void cartSetUp() {
	  ProductPage product = homePage.clickOnProduct("Samsung galaxy s6");
	  product.clickOnAddToCart();
	  cart = homePage.clickOnCart();
  }
}
