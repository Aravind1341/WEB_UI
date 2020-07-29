package com.webui.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webui.qa.base.TestBase;

public class ApplicationConfigPage extends TestBase {

	
	@FindBy(xpath="//span[text()='Currency           ']")
	WebElement currency;

	@FindBy(xpath = "//span[text()='Contact            ']")
	@CacheLookup
	WebElement Contact;
	
	
	@FindBy(xpath = "//span[text()='Batch Event List       ']")
	@CacheLookup
	WebElement Batch_Event_List;
	
	
	//Initializing the page objects
	public ApplicationConfigPage() {
		PageFactory.initElements(driver, this);
	}
	
	public CurrencyPage clickoncurrency() {
		currency.click();
		return new CurrencyPage();
	}
	
	public ContactPage clickonContact() {
		Contact.click();
		
		return new ContactPage();
	}
	
	public BatchEventListPage clickonBatchEventList() {
		Batch_Event_List.click();
		
		return new BatchEventListPage();
	}
	
	
	
}
