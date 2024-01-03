package wep_pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By signUpLink = By.id("signin2");
	By loginLink = By.id("login2");	
	By cartLink = By.cssSelector("#navbarExample > ul > li:nth-child(4)");
	By productName;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public SignUpPage clickOnSignUp() {
		driver.findElement(signUpLink).click();
		return new SignUpPage(driver);
	}
	
	public LoginPage clickOnLogin() {
		driver.findElement(loginLink).click();
		return new LoginPage(driver);
	}
	
	public CartPage clickOnCart() {
		driver.findElement(cartLink).click();
		return new CartPage(driver);
	}
	public ProductPage clickOnProduct(String productName) {

		this.productName = By.partialLinkText(productName);
		wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.presenceOfElementLocated(this.productName));
		driver.findElement(this.productName).click();

		return new ProductPage(driver);
	}
}
