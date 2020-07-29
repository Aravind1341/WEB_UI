package com.webui.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webui.qa.base.TestBase;

public class LoginPage extends TestBase {

	// page factory or object repositoary 
	@FindBy(name="username")
	WebElement username;
	
	
	@FindBy(name="password")
	WebElement password;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement login;
	
	//Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		
		return new HomePage();
	}
	
}
