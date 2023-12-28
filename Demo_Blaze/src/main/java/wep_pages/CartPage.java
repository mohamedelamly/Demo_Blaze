package wep_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	WebDriver driver;
	
	By placeOrderButton = By.cssSelector("#page-wrapper > div > div.col-lg-1 > button");
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnPlaceOrderButton() {
		driver.findElement(placeOrderButton);
	}
}
