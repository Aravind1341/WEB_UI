package com.webui.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webui.qa.base.TestBase;



public class AddBatchEventListPage extends TestBase{
	
	@FindBy(name = "batConfEventListTab1:code")
	@CacheLookup
	WebElement code;
	
	@FindBy(name = "batConfEventListTab1:sdesc")
	@CacheLookup
	WebElement ShortDesc;
	
	@FindBy(name = "batConfEventListTab1:ldesc")
	@CacheLookup
	WebElement LongDesc;
	
	@FindBy(name = "batConfEventListTab1:status")
	@CacheLookup
	WebElement Status;
	
	@FindBy(name = "batConfEventListTab1:lastFunc")
	@CacheLookup
	WebElement LastFunc;
	
	@FindBy(name = "batConfEventListTab1:lastFuncAction")
	@CacheLookup
	WebElement LastFuncAction;
	
	@FindBy(name = "backBtn")
	@CacheLookup
	WebElement Back;
	
	@FindBy(name = "refreshBtn")
	@CacheLookup
	WebElement Refresh;
	
	@FindBy(name = "helpBtn")
	@CacheLookup
	WebElement Help;
	
	@FindBy(name = "saveBtn")
	@CacheLookup
	WebElement Save;
	
	@FindBy(className = "feedbackPanel")
	@CacheLookup
	WebElement feedBackPanel;

	
	public AddBatchEventListPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public String validateAddNewRecordPageTitle() {
		return driver.getTitle();
	}
	
	public void EnterDetails(String Code, String SDesc, String LDesc, String Sts, String LastFunction, String LastFuncAct) {
		code.sendKeys(Code);
		ShortDesc.sendKeys(SDesc);
		LongDesc.sendKeys(LDesc);
		Status.sendKeys(Sts);
		LastFunc.sendKeys(LastFunction);
		LastFuncAction.sendKeys(LastFuncAct);
	}
	
	public String validateFeedbackPanel() {
		return feedBackPanel.getText();
	}
	
	
	public void ClickSave() {
		Save.click();
	}
	

}