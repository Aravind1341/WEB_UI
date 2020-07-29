package com.webui.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webui.qa.base.TestBase;
import com.webui.qa.pages.ConfigureFieldPage;
import com.webui.qa.pages.HomePage;
import com.webui.qa.pages.LoginPage;
import com.webui.qa.pages.SystemConfigPage;

public class ConfigureFieldPageTest extends TestBase  {
	LoginPage loginPage;
	HomePage homePage;
	SystemConfigPage systemConfigPage;
	ConfigureFieldPage configureFieldPage;
	
	
	
	public ConfigureFieldPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		systemConfigPage = homePage.clickonsystemconfig();
		configureFieldPage = systemConfigPage.clickonConfigureField();
	}

	@Test(priority = 1)
	public void verifyCurrencyPage() {
		configureFieldPage.clickonadd();

	}

	
	 @AfterMethod 
	 public void tearDown() {
		 driver.quit(); 
		 }

	
}
