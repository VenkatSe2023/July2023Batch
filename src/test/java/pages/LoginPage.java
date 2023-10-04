package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public WebDriver driver;
	//Constructor
	public LoginPage(WebDriver driver){
        this.driver=driver;
    }
	
	//locators
	By logo_img = By.xpath("//img[@alt='company-branding']");
	By txt_username = By.xpath("//input[@name='username']");
	By txt_password = By.xpath("//input[@name='password']");
	By btn_login = By.xpath("//button[contains(@class, 'orangehrm-login-button')]");
	 
	//Action Methods
	public void setUsername(String uname) {
		driver.findElement(txt_username).sendKeys(uname);
	}
	 
	public void setPassword(String pswrd){
        driver.findElement(txt_password).sendKeys(pswrd);
    } 
	 
	public void clickSubmit(){
        driver.findElement(btn_login).click();
    }
	
	public boolean checkLogoPresence(){
        return driver.findElement(logo_img).isDisplayed();
    }
}
