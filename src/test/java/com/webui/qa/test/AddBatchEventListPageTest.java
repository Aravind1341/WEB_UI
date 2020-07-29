package com.webui.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webui.qa.base.TestBase;
import com.webui.qa.pages.AddBatchEventListPage;
import com.webui.qa.pages.ApplicationConfigPage;
import com.webui.qa.pages.BatchEventListPage;
import com.webui.qa.pages.HomePage;
import com.webui.qa.pages.LoginPage;
import com.webui.qa.util.TestUtil;


public class AddBatchEventListPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homepage;
	ApplicationConfigPage appConfigPage;
	BatchEventListPage batchEventListPage;
	AddBatchEventListPage addBatchEventListPage;
	
	String sheetName = "BatchEvent_AddNew";
	
	
	public AddBatchEventListPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		appConfigPage = homepage.clickonapplicationconfig();
		batchEventListPage = appConfigPage.clickonBatchEventList();
		addBatchEventListPage = batchEventListPage.ClickAdd();
		
	}
	
	@DataProvider
	public Object[][] getBatchEventListData() {
		Object[][] data = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1, dataProvider = "getBatchEventListData")
	public void AddnewRecordTest(String Code, String ShortDescription, String LongDescription, String Status, String LastFunction, String LastFuncAction){
		addBatchEventListPage.EnterDetails(Code, ShortDescription, LongDescription, Status, LastFunction, LastFuncAction);
		addBatchEventListPage.ClickSave();
		
		String Success1Line = "Your record has been successfully added.";
		String Success2Line = "Code : "+Code;
		String nextLine = "\n";
		String Success = Success1Line + nextLine + Success2Line;
		String AlreadyExist = "Unable to add record: Record already exists.";
		
		String text = addBatchEventListPage.validateFeedbackPanel();

		if(text.equals(Success)) {
			log.info("**********"+text+"**********");
		} else if(text.equals(AlreadyExist)){
			log.error("**********"+text+"**********");
		} else {
			log.error("**********"+text+"**********");
		}
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
