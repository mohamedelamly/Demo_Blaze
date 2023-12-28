package wep_pages_test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wep_pages.CartPage;

public class CartTest extends BaseTest {
	CartPage cart;
  @Test
  public void checkOut() {
	  cart.clickOnPlaceOrderButton();
  }
  @BeforeClass
  public void cartSetUp() {
	  cart = homePage.clickOnCart();
  }
}
