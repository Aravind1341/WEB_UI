package com.webui.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webui.qa.base.TestBase;



public class BatchEventListPage extends TestBase{
	
	@FindBy(xpath = "(//button[@class='regular'])[1]")
	@CacheLookup
	WebElement AddNewRecord;
	
	@FindBy(xpath = "//div[@id='containment-wrapper']/table[1]/tbody[1]/tr[1]/th[2]/div[1]/button[2]/wicket:message[1]")
	@CacheLookup
	WebElement Refresh;
	
	@FindBy(id = "mainFilter62")
	@CacheLookup
	WebElement AddFilter;
	
	@FindBy(id = "code64")
	@CacheLookup
	WebElement MGroupSearch;
	
	@FindBy(id = "searchBtn")
	@CacheLookup
	WebElement Search;
	
	@FindBy(id = "applyBtn")
	@CacheLookup
	WebElement Clear;
	
	public BatchEventListPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public String validateBatchEventListPageTitle() {
		return driver.getTitle();
	}
	
	public AddBatchEventListPage ClickAdd() {
		AddNewRecord.click();
		
		return new AddBatchEventListPage();
	}
	

}