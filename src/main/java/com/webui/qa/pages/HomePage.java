package com.webui.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webui.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//span[text()='TestUser']")
	@CacheLookup  // if the element does not change can use cache lookup.
	WebElement userNameLabel;
	
	@FindBy(xpath="(//ul[@id='menu']//a)[1]")
	@CacheLookup
	WebElement dashBoard;
	
	@FindBy(xpath="//span[text()='business data']")
	@CacheLookup
	WebElement businessData;
	
	@FindBy(xpath="//span[text()='application config']")
	@CacheLookup
	WebElement applicationConfig;
	
	@FindBy(xpath="//span[text()='system config']")
	@CacheLookup
	WebElement systemConfig;
	
	@FindBy(xpath="//span[text()='admin']")
	@CacheLookup
	WebElement admin;
	
	@FindBy(xpath="//a[@id='logout11']/wicket:message[1]")
	@CacheLookup
	WebElement logout;
	
	@FindBy(id="quickNavSearch")
	@CacheLookup
	WebElement quickNavigation;
	
	@FindBy(xpath="//div[@id='colOne']/div[2]/ul[2]/li[1]/a[1]/wicket:message[1]")
	@CacheLookup
	WebElement changePassword;
	
	
	
	//Initializing the page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyhomepagetitle() {
		return driver.getTitle();
	}
	
	public boolean verifyusername() {
		return userNameLabel.isDisplayed();
	}
	
	public void clickondashboard() {
		dashBoard.click();
	}

	public void clickonbusinessdata() {
		businessData.click();
	}
	
		
	public ApplicationConfigPage clickonapplicationconfig() {
		 applicationConfig.click();
		 return new ApplicationConfigPage();
	}
	
		
	public SystemConfigPage clickonsystemconfig() {
		systemConfig.click();
		 return new SystemConfigPage();
	}
	
	public void clickonadmin() {
		admin.click();
	}
	
	public void clickonlogout() {
		logout.click();
	}
	
	public void clickonquicknavigation() {
		quickNavigation.click();
	}
	
	public void clickonchangePassword() {
		changePassword.click();
	}
	
	
	
}
