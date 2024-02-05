package wep_pages_test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wep_pages.LoginPage;


public class LoginTest extends BaseTest {
	LoginPage login;
  @Test
  public void loginWithValidDate() {
	  login.clickLogin("Mohamed", "123123");
  }
  @BeforeClass
  public void loginSetUp() {
	  login = homePage.clickOnLogin();
  }
}
