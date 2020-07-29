package com.webui.qa.test;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webui.qa.base.TestBase;
import com.webui.qa.pages.AddContactPage;
import com.webui.qa.pages.ApplicationConfigPage;
import com.webui.qa.pages.ContactPage;
import com.webui.qa.pages.HomePage;
import com.webui.qa.pages.LoginPage;
import com.webui.qa.util.TestUtil;



public class AddContactPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	ApplicationConfigPage appConfigPage;
	ContactPage contactPage;
	AddContactPage addContactPage;
	
	
	String sheetName = "Contacts_AddNew";
	
	
	public AddContactPageTest() {
		super();
	}
	
	//TestCases should separated -- Independent with each other
	//@Before the test cases -- launch the browser and login
	//@Test -- Execute the test cases
	//@After the test cases -- close the browser
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		appConfigPage = new ApplicationConfigPage();
		contactPage = new ContactPage();
		addContactPage = new AddContactPage();
		appConfigPage = homePage.clickonapplicationconfig();
		contactPage = appConfigPage.clickonContact();
		addContactPage = contactPage.ClickAdd();
	}
	
	@Test(priority=1)
	public void ContactPageTitleTest() {
		String title = addContactPage.validateAddNewRecordPageTitle();
		Assert.assertEquals(title, "M^Dynamics Web UI", "HomePage title is not Matched");
	}
	
	
	@DataProvider
	public Object[][] getContactTestData() {
		Object[][] data = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=2, dataProvider = "getContactTestData")
	public void AddNewRecordTest(String MaintenanceGroup, String NameofContact, String Email, String TelephoneNumber, String MobileNumber) {
		//addNewRecordPage.EnterDetails("Automate_Maintenance_Group", "Automated_Name_of_Contact", "Automated@gmail.com", "1234567890", "9087654321");
		addContactPage.EnterDetails(MaintenanceGroup, NameofContact, Email, TelephoneNumber, MobileNumber);
		addContactPage.ClickSave();
		
		String Success1Line = "Your record has been successfully added.";
		String Success2Line = "Maintenance Group: "+MaintenanceGroup;
		String nextLine = "\n";
		String Success = Success1Line + nextLine + Success2Line;
		String AlreadyExist = "Unable to add record: Record already exists.";
		
		String text = addContactPage.validateFeedbackPanel();

		if(text.equals(Success)) {
			log.info("**********"+text+"**********");
		} else if(text.equals(AlreadyExist)){
			log.error("**********"+text+"**********");
		} else {
			log.error("**********"+text+"**********");
		}
			
//		assertEquals(text, "Your record has been successfully added.");
//		boolean flag = addNewRecordPage.VerifySuccessMsg();
//		assertTrue(flag);
//		System.out.println(flag);
//		log.info(flag);
//		if(flag == true){
//			
//		}
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		log.info("***************Chrome Browser Closed***************");
	}

}
