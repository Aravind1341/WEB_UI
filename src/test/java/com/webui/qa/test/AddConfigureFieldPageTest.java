package com.webui.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webui.qa.base.TestBase;
import com.webui.qa.pages.AddConfigureFieldPage;
import com.webui.qa.pages.ConfigureFieldPage;
import com.webui.qa.pages.HomePage;
import com.webui.qa.pages.LoginPage;
import com.webui.qa.pages.SystemConfigPage;
import com.webui.qa.util.TestUtil;

public class AddConfigureFieldPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	SystemConfigPage systemConfigPage;
	ConfigureFieldPage configureFieldPage;
	AddConfigureFieldPage addConfigureFieldPage;
	
	
	String sheetName = "ConfigureField";
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		systemConfigPage = homePage.clickonsystemconfig();
		configureFieldPage = systemConfigPage.clickonConfigureField();
		addConfigureFieldPage = configureFieldPage.clickonadd();
		
	}

	@DataProvider
	public Object[][] getCurrencyTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(priority=1,dataProvider="getCurrencyTestData")
	public void enterConfigureFieldDetails(String ModuleID,String FieldID,String DisabledFlag,String DatabaseColumnName,String DatabaseColumnDataType,
			String Operations,String SearchCompulsory,String SearchDefault,String FieldGroupID,String FieldSequence, String FieldType,
			String FieldWithoutLabel,String FieldWidth,String DefaultValue,String KeyField,String KeySequence,String Compulsory, String InputDataType,
			String InputDataLength,String InputDataFormat,String InputValidationClass,String InputValidationParameters,
			String SelSourcetype,String SelCommonListname,String SelMatchTypeListname,String SelMatchTypeRefId,String SelRefTablename,String SelRefTableLocatemode,
			String SelRefTableLocateparam,String SelRefTableValColname,String SelRefTableDescColname,String SelRefTableaddFilter,
			String SelRefTableRefcriteria,String SelRefTableReffields,String DerReffields,String Derivemethod,String DerCustclass,
			String Derparams,String DBColDataformat,String FieldtypeProp,String FieldtypeParams) {
		
//		addConfigureFieldPage.ClickGeneralTab();
		
		addConfigureFieldPage.enterGeneralDetails( ModuleID, FieldID, DisabledFlag, DatabaseColumnName, DatabaseColumnDataType,
				 Operations, SearchCompulsory, SearchDefault, FieldGroupID, FieldSequence,  FieldType, FieldWithoutLabel, FieldWidth, DefaultValue);
		
		addConfigureFieldPage.ClickInputsTab();
		
		addConfigureFieldPage.enterInputsDetails( KeyField, KeySequence, Compulsory,  InputDataType,
				 InputDataLength, InputDataFormat, InputValidationClass, InputValidationParameters );
		
		addConfigureFieldPage.ClickSelectiontab();
		
		addConfigureFieldPage.enterSelectionDetails(SelSourcetype, SelCommonListname, SelMatchTypeListname, SelMatchTypeRefId,
				SelRefTablename, SelRefTableLocatemode, SelRefTableLocateparam, SelRefTableValColname, SelRefTableDescColname, 
				SelRefTableaddFilter, SelRefTableRefcriteria, SelRefTableReffields);
		
		addConfigureFieldPage.ClickDerivationtab();
		
		addConfigureFieldPage.enterDerivaitonDetails(DerReffields, Derivemethod, DerCustclass, Derparams, DBColDataformat, FieldtypeProp, FieldtypeParams);
		
		addConfigureFieldPage.ClickSave();
		
		String Success1Line = "Your record has been successfully added.";
	    String Success2Line = "Module Id: "+ModuleID;
	    String Success3Line = "Field Id: "+FieldID;
	    String nextLine = "\n";
	    String Success = Success1Line + nextLine + Success2Line + nextLine + Success3Line;
	    String AlreadyExist = "Unable to add record: Record already exists.";
	    
	    String text = addConfigureFieldPage.validateFeedbackPanel();



	    if(text.equals(Success)) {
	        log.info("**********"+text+"**********");
	    } else if(text.equals(AlreadyExist)){
	       log.error("**********"+text+"**********");
	    } else {
	       log.error("**********"+text+"**********");
	    }
		
		
	}

	
		 @AfterMethod 
		 public void tearDown() { 
		driver.quit(); 
		}

	
	
}
