package com.webui.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webui.qa.base.TestBase;
import com.webui.qa.pages.AddPage;
import com.webui.qa.pages.ApplicationConfigPage;
import com.webui.qa.pages.CurrencyPage;
import com.webui.qa.pages.HomePage;
import com.webui.qa.pages.LoginPage;
import com.webui.qa.util.TestUtil;

public class AddPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ApplicationConfigPage applicationConfigPage;
	CurrencyPage currencyPage;
	AddPage addPage;
	String sheetName = "TestData";
public AddPageTest() {
	super();
}

@BeforeMethod
public void setup() {
	initialization();
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	applicationConfigPage = homePage.clickonapplicationconfig();
	currencyPage = applicationConfigPage.clickoncurrency();
	addPage = currencyPage.clickonadd();
	
}

@DataProvider
public Object[][] getCurrencyTestData() {
	Object data[][] = TestUtil.getTestData(sheetName);
	return data;
}

@Test(priority=1,dataProvider="getCurrencyTestData")
public void enterCurrencyDetails(String CurrencyName,String CurrencyCode,String NumericCurrencyCode,String MinorUnit) {
	addPage.enterValueinCurrencyModule(CurrencyName,CurrencyCode,NumericCurrencyCode,MinorUnit);
//	Assert.assertTrue(addPage.verifysuccessmessage());
	String Success1Line = "Your record has been successfully added.";
    String Success2Line = "Currency COde: "+CurrencyName;
    String nextLine = "\n";
    String Success = Success1Line + nextLine + Success2Line;
    String AlreadyExist = "Unable to add record: Record already exists.";
    
    String text = addPage.validateFeedbackPanel();



    if(text.equals(Success)) {
        log.info("**********"+text+"**********");
    } else if(text.equals(AlreadyExist)){
       log.error("**********"+text+"**********");
    } else {
       log.error("**********"+text+"**********");
    }
	
	//addPage.enterValueinCurrencyModule("austr","AUD","032","2");
}

//@Test(priority=2)
//public void verifySuccessMessage() {
//	String successMessageTitle = addPage.verifysuccessmessage();
//	Assert.assertEquals(successMessageTitle,"Your record has been successfully added.");
//}
	
	 @AfterMethod 
	 public void tearDown() { 
	driver.quit(); 
	}

}
