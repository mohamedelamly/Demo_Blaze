package wep_pages_test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wep_pages.SignUpPage;

public class SignUpTest extends BaseTest{
	SignUpPage signUp;
	
  @Test(priority = 1)
  public void signUpWithValidData() {
	  signUp.clickSignUp("Mohamed", "123123");
  }
  @BeforeClass
  public void signUpSetUp() {
	  
	  signUp = homePage.clickOnSignUp();
  }
}
