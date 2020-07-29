package com.webui.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webui.qa.base.TestBase;
import com.webui.qa.pages.AddTCPConnectionPage;
import com.webui.qa.pages.HomePage;
import com.webui.qa.pages.LoginPage;
import com.webui.qa.pages.SystemConfigPage;
import com.webui.qa.pages.TCPConnectionPage;
import com.webui.qa.util.TestUtil;



public class AddTCPConnectionPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homepage;
	SystemConfigPage sysConfigPage;
	TCPConnectionPage tcpConnectionPage;
	AddTCPConnectionPage addTCPConnectionPage;
	
	String sheetName = "TCPConnection_AddNew";
	
	
	public AddTCPConnectionPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		sysConfigPage = homepage.clickonsystemconfig();
		tcpConnectionPage = sysConfigPage.clickTCPConnect();
		addTCPConnectionPage = tcpConnectionPage.clickAdd();
	}
	
	
	@DataProvider
	public Object[][] getTCPConnectionData() {
		Object[][] data = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1, dataProvider = "getTCPConnectionData")
	public void AddTCpConnection(String PoolName, String DisableFlag, String ProcessID, String HostName, 
			String PortNumber, String ConnectionType, String PersistentConnection, String MaximumConnectionAllowed,
			String ReadTimeout, String MaximumConnectionRetries, String MaximumSocketRetries, String MaximumBufferSize,
			String IncludeLength, String LengthFieldSize, String EndofMessageIndicator, String LengthFieldCoding, 
			String Initial, String Minimum, String Maximum, String InitialConnections, String MinimumConnections, String ConnectionWait, 
			String RetryInterval, String MaximumConnectionWaitforRead, String MaximumPoolforRead, String MaxWaitforReply, String QueueLength) {
		
		addTCPConnectionPage.EnterDetailsinTCPConnectionTab(PoolName, DisableFlag, ProcessID, HostName,
				PortNumber, ConnectionType, PersistentConnection, MaximumConnectionAllowed, ReadTimeout, MaximumConnectionRetries,
				MaximumSocketRetries, MaximumBufferSize, IncludeLength, LengthFieldSize, EndofMessageIndicator,
				LengthFieldCoding, Initial, Minimum, Maximum);
		addTCPConnectionPage.ClickClientTab();
		addTCPConnectionPage.EnterDetailsinClientTab(InitialConnections, MinimumConnections, ConnectionWait, RetryInterval);
		addTCPConnectionPage.ClickServerTab();
		addTCPConnectionPage.EnterDetailsinServerTab(MaximumConnectionWaitforRead, MaximumPoolforRead, MaxWaitforReply, QueueLength);
		addTCPConnectionPage.clickSave();
		
		
		String NextLine = "\n";
		String SuccessLine1 = "Your record has been successfully added.";
		String SuccessLine2 = "Process ID: "+ ProcessID;
		String SuccessLine3 = "Pool Name: "+ PoolName;
		String Success = SuccessLine1+NextLine+SuccessLine2+NextLine+SuccessLine3;
		String AlreadyExist = "Unable to add record: Record already exists.";
		
		String text = addTCPConnectionPage.validateFeedbackPanel();
		
		if(text.equals(Success)) {
			log.info(Success);
		} else if(text.equals(AlreadyExist)){
			log.error(AlreadyExist);
		} else {
			log.error(text);
		}
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
