package com.webui.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webui.qa.base.TestBase;



public class TCPConnectionPage extends TestBase{

	
	@FindBy(xpath = "(//button[@class='regular'])[1]")
	@CacheLookup
	WebElement ClickAdd;
	
	public TCPConnectionPage() {
		PageFactory.initElements(driver, this);
	}

	public AddTCPConnectionPage clickAdd() {
		ClickAdd.click();
		
		return new AddTCPConnectionPage();
	}
	
}
