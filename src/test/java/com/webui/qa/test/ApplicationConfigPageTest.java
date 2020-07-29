package com.webui.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webui.qa.base.TestBase;
import com.webui.qa.pages.ApplicationConfigPage;
import com.webui.qa.pages.HomePage;
import com.webui.qa.pages.LoginPage;

public class ApplicationConfigPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ApplicationConfigPage applicationConfigPage;

	public ApplicationConfigPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		applicationConfigPage = homePage.clickonapplicationconfig();

	}

	@Test(priority = 1)
	public void verifyCurrencyPage() {
		applicationConfigPage.clickoncurrency();

	}

	
	 @AfterMethod 
	 public void tearDown() {
		 driver.quit(); 
		 }
	 

}
