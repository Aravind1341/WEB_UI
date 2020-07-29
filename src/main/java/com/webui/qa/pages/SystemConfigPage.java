package com.webui.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webui.qa.base.TestBase;


public class SystemConfigPage extends TestBase{
	
	@FindBy(xpath="(//span[@class='dashboard_text'])[3]")
	WebElement configureField;
	
	
	@FindBy(xpath = "//span[text() = 'TCP Connection        ']")
    WebElement TCPConnect;

	//Initializing the page objects
	public SystemConfigPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ConfigureFieldPage clickonConfigureField() {
		configureField.click();
		return new ConfigureFieldPage();
	}
	
	public TCPConnectionPage clickTCPConnect() {
        TCPConnect.click();
       
        return new TCPConnectionPage();
    }
}
