package com.webui.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webui.qa.base.TestBase;

public class CurrencyPage extends TestBase{

	@FindBy(xpath="(//button[@class='regular'])[1]")
	WebElement add;
	
	//Initializing the page objects
		public CurrencyPage() {
			PageFactory.initElements(driver, this);
		}
	
		public AddPage clickonadd() {
			add.click();
			return new AddPage();
		}
		
}
