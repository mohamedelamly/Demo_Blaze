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
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnAddToCart() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(2));
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
