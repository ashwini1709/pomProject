package com.saucedemo.Scrpts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.saucedemo.webpage.LoginPage;

public class TestScrpt_01 {
	public static void main(String[] args) {
		//open browser
	
		WebDriver driver=new FirefoxDriver();
		//open app
		driver.get("https://www.saucedemo.com/");
		//creaTE object of page
		LoginPage l2=new LoginPage(driver);
		l2.enterUsername("standard_user");
		l2.enterpassword("secret_sauce");
		l2.clickOnloginBotton();
	}


}
