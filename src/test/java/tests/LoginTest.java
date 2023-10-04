package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	
	LoginPage loginPage;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		loginPage = new LoginPage(driver);
	}
	
	@Test(priority = 1)
	public void testLogo() {
		
		Assert.assertEquals(loginPage.checkLogoPresence(), true);
		
	}
	
	@Test(priority = 2)
	public void testLogin() {
		
		loginPage = new LoginPage(driver);
		loginPage.setUsername("Admin");
		loginPage.setPassword("admin123");
		loginPage.clickSubmit();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	
	@AfterClass
	public void testDown() {
		driver.quit();
	}

}
