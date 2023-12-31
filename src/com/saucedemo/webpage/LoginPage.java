package com.saucedemo.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	//constructor
	public LoginPage(WebDriver d)
	{
		driver=d;
		// this method will create web elements
		PageFactory.initElements(driver, this);
	}
	
	//identify web element
	//identify user name
		@FindBy(id="user-name")
		WebElement username;
		@FindBy(id="password")
		WebElement password;
		
        @FindBy(id="login-button")
        WebElement loginBtn;
	
	public void enterUsername(String uname) {
		username.sendKeys(uname);
		
	}
	public void enterpassword(String pwd) {
		password.sendKeys(pwd);
		
	}
	public void clickOnloginBotton() {
		loginBtn.click();
		

}



}
