package com.webui.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webui.qa.base.TestBase;



public class AddContactPage extends TestBase{
	
	@FindBy(name = "contactTab1:maintGroup")
	@CacheLookup
	WebElement MaintenanceGroup;
	
	@FindBy(name = "contactTab1:name")
	@CacheLookup
	WebElement NameofContact ;
	
	@FindBy(name = "contactTab1:emailID")
	@CacheLookup
	WebElement Email;
	
	@FindBy(name = "contactTab1:phoneNumber")
	@CacheLookup
	WebElement TelephoneNumber;
	
	@FindBy(name = "contactTab1:mobileNumber")
	@CacheLookup
	WebElement MobilePhoneNumber;
	
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
	
	@FindBy(xpath = "//span[text()='Your record has been successfully added.']")
	@CacheLookup
	WebElement Success;
	
	@FindBy(xpath = "//span[text()='Unable to add record: Record already exists.']")
	@CacheLookup
	WebElement AlreadyExist;
	
	public AddContactPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public String validateAddNewRecordPageTitle() {
		return driver.getTitle();
	}
	
	public void EnterDetails(String MGroup, String Name, String email, String TPhone, String MPhone) {
		MaintenanceGroup.sendKeys(MGroup);
		NameofContact.sendKeys(Name);
		Email.sendKeys(email);
		TelephoneNumber.sendKeys(TPhone);
		MobilePhoneNumber.sendKeys(MPhone);

	}
	
	public String validateFeedbackPanel() {
		return feedBackPanel.getText();
	}
	
	
	public boolean VerifySuccessMsg() {
		return Success.isDisplayed(); 
	}
	
	public boolean VerifyAlreayExistMsg() {
		return AlreadyExist.isDisplayed();
	}
	
	public void ClickSave() {
		Save.click();
	}
	

}