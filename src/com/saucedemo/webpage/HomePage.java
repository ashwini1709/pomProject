package com.saucedemo.webpage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	//constructor
	public HomePage(WebDriver d)
	{
		driver=d;
		// this method will create web elements
		PageFactory.initElements(driver, this);
	}
	
	//identify web element
	//identify user name
		@FindBy(id="add-to-cart-sauce-labs-backpack")
		WebElement addpro;
		@FindBy(className = "shopping_cart_badge")
		WebElement clickonico;
		
        @FindBy(xpath = ".//div[text()='Sauce Labs Backpack']")
        WebElement checkproduct;
        
        @FindBy(xpath = ".//select[@class='product_sort_container']")
        WebElement filtter;
        
        @FindBy(xpath = ".//div[@class='inventory_item_price']")
         List<WebElement> price;
        
        
	public void addProduct() {
		addpro.click();
		
	}
	public void clickOnIcon() {
		clickonico.click();
		
	}
	public void checkProductsadded() {
		
		checkproduct.click();
		//verify pruduct added or not
				boolean pro_di = checkproduct.isDisplayed();
				if(pro_di)
				{
					System.out.println("product added");
				}
				else
				{
					System.out.println("product not added");
				}
		

      }
	public void filtterOption() {
		Select s= new Select(filtter);
		s.selectByValue("lohi");
		
	}
	public void printprice() {
		for(int i=0;i<price.size();i++)
		{
		System.out.println("total no of price------"+price.get(i).getText());
		
	}
	}
	
	public void cloes() {
		driver.close();
		
	}

	

}
