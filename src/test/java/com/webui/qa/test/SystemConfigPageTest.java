package com.webui.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webui.qa.base.TestBase;
import com.webui.qa.pages.HomePage;
import com.webui.qa.pages.LoginPage;
import com.webui.qa.pages.SystemConfigPage;

public class SystemConfigPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	SystemConfigPage systemConfigPage;
	
	
	public SystemConfigPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		systemConfigPage = homePage.clickonsystemconfig();

	}

	@Test(priority = 1)
	public void verifyCurrencyPage() {
		systemConfigPage.clickonConfigureField();

	}

	
	 @AfterMethod 
	 public void tearDown() {
		 driver.quit(); 
		 }


}
