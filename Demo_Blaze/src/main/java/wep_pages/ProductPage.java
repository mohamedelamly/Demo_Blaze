package wep_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	WebDriver driver;
	WebDriverWait wait;
	
	private By addToCartButton = By.cssSelector("#tbodyid > div.row > div > a");
	private By productName = By.cssSelector("#tbodyid > h2");
	private By productPrice = By.className("price-container");
	
	public static String productNameItem ;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	}
	
	public String getProductName() {
        wait.until(ExpectedConditions.presenceOfElementLocated(productName));
        productNameItem = driver.findElement(productName).getText();
		return productNameItem;
	}
	public String getProductPrice() {
        wait.until(ExpectedConditions.presenceOfElementLocated(productPrice));
		return driver.findElement(productPrice).getText();
	}
	
	public void clickOnAddToCart() {
        wait.until(ExpectedConditions.presenceOfElementLocated(addToCartButton));
		driver.findElement(addToCartButton).click();
	}
	public void acceptAllert() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	public void addToCart() {
		clickOnAddToCart();
		acceptAllert();
	}

}
