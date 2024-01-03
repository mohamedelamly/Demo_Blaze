package wep_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By placeOrderButton = By.cssSelector("#page-wrapper > div > div.col-lg-1 > button");
	
	private By productName = By.cssSelector("#tbodyid > tr > td:nth-child(2)");
	private By productPrice = By.cssSelector("#tbodyid > tr > td:nth-child(3)");
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(2));

	}
	
	public String getProductName() {
        wait.until(ExpectedConditions.presenceOfElementLocated(productName));
		return driver.findElement(productName).getText();
	}
	
	public String getProductPrice() {
        wait.until(ExpectedConditions.presenceOfElementLocated(productPrice));
		return driver.findElement(productPrice).getText();
	}
	
	public void clickOnPlaceOrderButton() {
		driver.findElement(placeOrderButton);
	}
}
