package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
	
	public WebDriver driver;
	//Constructor
	public LoginPageWithPageFactory(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath="//img[@alt='company-branding']")
	WebElement img_logo;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement btn_login;
	
	 
	//Action Methods
	public void setUsername(String uname) {
		txt_username.sendKeys(uname);
	}
	 
	public void setPassword(String pswrd){
		txt_password.sendKeys(pswrd);
    } 
	 
	public void clickSubmit(){
		btn_login.click();
    }
	
	public boolean checkLogoPresence(){
        return img_logo.isDisplayed();
    }
}
