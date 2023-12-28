package wep_pages_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import wep_pages.HomePage;

public class BaseTest {
	
	 protected WebDriver driver;
	 protected HomePage homePage;
	 protected String homePageUrl = "https://www.demoblaze.com/";

  @BeforeClass
  public void setUp() {
	  driver = new ChromeDriver();
	  getHomePage();
	  driver.manage().window().maximize();
	  homePage = new HomePage(driver);
  }
  
  @AfterClass
  public void tearDown() {
	  driver.quit();
  }
  
  public void getHomePage() {
	  driver.get(homePageUrl);
  }
}
