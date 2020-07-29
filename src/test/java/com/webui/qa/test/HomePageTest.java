package com.webui.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webui.qa.base.TestBase;
import com.webui.qa.pages.CurrencyPage;
import com.webui.qa.pages.HomePage;
import com.webui.qa.pages.LoginPage;
import com.webui.qa.util.TestUtil;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CurrencyPage currencyPage;
	TestUtil testUtil;
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyhomepagetitle();
		Assert.assertEquals(homePageTitle,"m^dynamics Configuration Console","Home page title not matched");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest() {
		Assert.assertTrue(homePage.verifyusername());
	}
	
	
	@Test(priority=3)
	public void verifyApplicationConfig() {
		homePage.clickonapplicationconfig();
	}
	
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
	
	
	
	
	
}
