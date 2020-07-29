package com.webui.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webui.qa.base.TestBase;

public class AddPage extends TestBase{
		
	@FindBy(id="currencyName4a")
	WebElement currencyName;
	
	@FindBy(id ="currencyCode4c")
    WebElement currencyCode;
	
	@FindBy(id= "numericCurrencyCode4e")
	WebElement numericCurrencyCode;
	
	@FindBy(id="currencyMinorUnit50")
	WebElement minorUnit;
	
	@FindBy(id="saveBtn40")
	WebElement saveButton;
	
	@FindBy(id= "backBtn52")
	WebElement backButton;
	
//	@FindBy(xpath="(//span[@class='feedbackPanelINFO'])[1]"	)
//	WebElement successMessage;
	
	@FindBy(className = "feedbackPanel")
     WebElement feedBackPanel;
	
	//Initializing the page objects
			public AddPage() {
				PageFactory.initElements(driver, this);
			}
		
			
			
			public void enterValueinCurrencyModule(String CurrencyName,String CurrencyCode,String NumericCurrencyCode,String MinorUnit) {
			
				
				currencyName.sendKeys(CurrencyName);
				currencyCode.sendKeys(CurrencyCode);
				numericCurrencyCode.sendKeys(NumericCurrencyCode);
				minorUnit.sendKeys(MinorUnit);
				saveButton.click();
				
				
				//public void enterValueinCurrencyModule()	{
				//currencyName.sendKeys("AmericanDollar");
				//currencyCode.sendKeys("AUD");
				//numericCurrencyCode.sendKeys("032");
				//minorUnit.sendKeys("2");
						
			}
			
//			public boolean verifysuccessmessage() {
//				return successMessage.isDisplayed();
//			}
			
			   public String validateFeedbackPanel() {
			        return feedBackPanel.getText();
			    }
			
			public void clickBack() {
				backButton.click();
			}
	
	
		
}
