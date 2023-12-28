package wep_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
	
	WebDriver driver;
	private By signUserName = By.id("sign-username");
	private By signPassword = By.id("sign-password");
	private By signUpButton = By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary");
	
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	public void insertUserName(String userName) {
		driver.findElement(signUserName).sendKeys(userName);
	}
	public void insertPassword(String password) {
		driver.findElement(signPassword).sendKeys(password);
	}
	public void clickSignUp(String userName, String password) {
		insertUserName(userName);
		insertPassword(password);
		driver.findElement(signUpButton);
	}
	
}
