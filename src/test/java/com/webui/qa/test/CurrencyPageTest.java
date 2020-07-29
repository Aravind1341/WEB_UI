package com.webui.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webui.qa.base.TestBase;
import com.webui.qa.pages.ApplicationConfigPage;
import com.webui.qa.pages.CurrencyPage;
import com.webui.qa.pages.HomePage;
import com.webui.qa.pages.LoginPage;

public class CurrencyPageTest  extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	ApplicationConfigPage applicationConfigPage;
	CurrencyPage currencyPage;
	
	
public CurrencyPageTest() {
	super();
}

@BeforeMethod
public void setup() {
	initialization();
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	applicationConfigPage = homePage.clickonapplicationconfig();
	currencyPage = applicationConfigPage.clickoncurrency();
}


@Test(priority=1)
public void verifyAddPage() {
	currencyPage.clickonadd();

}

	 @AfterMethod 
	 public void tearDown() { 
		 driver.quit(); 
		 }
	 
	 


}
