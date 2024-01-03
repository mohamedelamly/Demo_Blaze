package wep_pages_test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wep_pages.ProductPage;

public class ProductTest extends BaseTest {
	
	ProductPage product;
	
  @Test(dataProvider = "getProductData")
  public void addProductToCart(String productName) {
	  product=homePage.clickOnProduct(productName);
	  Assert.assertEquals(product.getProductName(), productName);
	  driver.navigate().to(homePageUrl);
  }
  
  
  @DataProvider
  public String[] getProductData() {
	  return new String[]{
		  "Samsung galaxy s6",
	  };
  }

}
