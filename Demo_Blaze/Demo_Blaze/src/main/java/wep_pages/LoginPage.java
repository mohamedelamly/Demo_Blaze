package wep_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	private By loginUserName = By.id("loginusername");
	private By loginPassword = By.id("loginpassword");
	private By loginButton = By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public void insertUserName(String userName) {
		driver.findElement(loginUserName).sendKeys(userName);
	}
	public void insertPassword(String password) {
		driver.findElement(loginPassword).sendKeys(password);
	}
	public void clickLogin(String userName, String password) {
		insertUserName(userName);
		insertPassword(password);
		driver.findElement(loginButton);
	}

}
