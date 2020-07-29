package com.webui.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webui.qa.base.TestBase;



public class AddTCPConnectionPage extends TestBase{
	
	@FindBy(name = "tcpconnTab1:poolName")
	@CacheLookup
	WebElement PoolName;
	
	@FindBy(name = "tcpconnTab1:disableFlagDropDown")
	@CacheLookup
	WebElement DisableFlag;
	
	@FindBy(name = "tcpconnTab1:processIdDropDown")
	@CacheLookup
	WebElement ProcessID;
	
	@FindBy(name = "tcpconnTab1:hostName")
	@CacheLookup
	WebElement HostName;
	
	@FindBy(name = "tcpconnTab1:portNumber")
	@CacheLookup
	WebElement PortNumber;
	
	@FindBy(name = "tcpconnTab1:connectionTypeDropDown")
	@CacheLookup
	WebElement ConnectionType;
	
	@FindBy(name = "tcpconnTab1:maxPersConnectionDropDown")
	@CacheLookup
	WebElement PersistentConnection;
	
	@FindBy(name = "tcpconnTab1:maxConnAllowed")
	@CacheLookup
	WebElement MaxConnectAllow;
	
	@FindBy(name = "tcpconnTab1:readTimeout")
	@CacheLookup
	WebElement ReedTimeOut;
	
	@FindBy(name = "tcpconnTab1:maxConnRetries")
	@CacheLookup
	WebElement MaxConnectRetries;
	
	@FindBy(name = "tcpconnTab1:maxSocketRetries")
	@CacheLookup
	WebElement MaxSocketRetries;
	
	@FindBy(name = "tcpconnTab1:maxBufferSize")
	@CacheLookup
	WebElement MaxBufferSize;
	
	@FindBy(name = "tcpconnTab1:includeLength")
	@CacheLookup
	WebElement IncludeLength;
	
	@FindBy(name = "tcpconnTab1:lengthFieldSize")
	@CacheLookup
	WebElement LengthFieldSize;
	
	@FindBy(name = "tcpconnTab1:endOfMsgInd")
	@CacheLookup
	WebElement EndofMsgInd;
	
	@FindBy(name = "tcpconnTab1:lengthFieldCodingDropDown")
	@CacheLookup
	WebElement LengthFieldCoding;
	
	@FindBy(name = "tcpconnTab1:initialListeners")
	@CacheLookup
	WebElement InitialListener;
	
	@FindBy(name = "tcpconnTab1:minListeners")
	@CacheLookup
	WebElement MinListener;
	
	@FindBy(name = "tcpconnTab1:maxListeners")
	@CacheLookup
	WebElement MaxListener;
	
	@FindBy(name = "tcpconnTab2:initialConnections")
	@CacheLookup
	WebElement InitialConnection;
	
	@FindBy(name = "tcpconnTab2:minConnections")
	@CacheLookup
	WebElement MinConnection;
	
	@FindBy(name = "tcpconnTab2:connectionWait")
	@CacheLookup
	WebElement ConnectionWait;
	
	@FindBy(name = "tcpconnTab2:retryInterval")
	@CacheLookup
	WebElement RetryInterval;
	
	@FindBy(name = "tcpconnTab3:maxConnWaitForRead")
	@CacheLookup
	WebElement MaxConnWaitforRead;
	
	@FindBy(name = "tcpconnTab3:maxPoolForRead")
	@CacheLookup
	WebElement MaxPoolforRead;
	
	@FindBy(name = "tcpconnTab3:maxWaitForReply")
	@CacheLookup
	WebElement MaxWaitforReply;
	
	@FindBy(name = "tcpconnTab3:queueLength")
	@CacheLookup
	WebElement QueueLength;
	
	@FindBy(name = "saveBtn")
	@CacheLookup
	WebElement Save;
	
	@FindBy(name = "refreshBtn")
	@CacheLookup
	WebElement Refresh;
	
	@FindBy(name = "backBtn")
	@CacheLookup
	WebElement Back;
	
	@FindBy(xpath = "//a[@href='#tcpconnTab1']")
	@CacheLookup
	WebElement Tab_TCPConnection;
	
	@FindBy(xpath = "//a[@href='#tcpconnTab2']")
	@CacheLookup
	WebElement Tab_Client;
	
	@FindBy(xpath = "//a[@href='#tcpconnTab3']")
	@CacheLookup
	WebElement Tab_Server;
	
	@FindBy(className = "feedbackPanel")
	@CacheLookup
	WebElement feedBackPanel;
	
	
	public AddTCPConnectionPage() { 
		PageFactory.initElements(driver, this);
	}

	
	public void ClickTCPConnectionTab() {
		Tab_TCPConnection.click();
	}
	
	public String validateFeedbackPanel() {
		return feedBackPanel.getText();
	}
	
	
	public void EnterDetailsinTCPConnectionTab(String Poolname, String Disableflag, String ProcessId, String Hostname, 
			String Portnumber, String Conntype, String PersisConn, String MaxConnAllow, String Readtimeout, 
			String MaxconnRetry, String MaxsocketRetry, String MaxBuffSize, String InclLeng, String LengFieldSize, String EndofmsgInd, String LengFieldCod, 
			String Initial, String Min, String Max) {
		PoolName.sendKeys(Poolname);
		selectDropDownUsingVisibleText(DisableFlag, Disableflag);
		selectDropDownUsingVisibleText(ProcessID, ProcessId);
		HostName.sendKeys(Hostname);
		PortNumber.sendKeys(Portnumber);
		selectDropDownUsingVisibleText(ConnectionType, Conntype);
		selectDropDownUsingVisibleText(PersistentConnection, PersisConn);
		MaxConnectAllow.sendKeys(MaxConnAllow);
		ReedTimeOut.sendKeys(Readtimeout);
		MaxConnectRetries.sendKeys(MaxconnRetry);
		MaxSocketRetries.sendKeys(MaxsocketRetry);
		MaxBufferSize.sendKeys(MaxBuffSize);
		IncludeLength.sendKeys(InclLeng);
		LengthFieldSize.sendKeys(LengFieldSize);
		EndofMsgInd.sendKeys(EndofmsgInd);
		selectDropDownUsingVisibleText(LengthFieldCoding, LengFieldCod);
		InitialListener.sendKeys(Initial);	
		MinListener.sendKeys(Min);
		MaxListener.sendKeys(Max);
		
	}
	
	public void ClickClientTab() {
		Tab_Client.click();
	}
	
	public void EnterDetailsinClientTab(String InitialConn, String MinConn, String ConnWait, String Retryinterval) {
		InitialConnection.sendKeys(InitialConn);
		MinConnection.sendKeys(MinConn);	
		ConnectionWait.sendKeys(ConnWait);
		RetryInterval.sendKeys(Retryinterval);
		
	}
	
	public void ClickServerTab() {
		Tab_Server.click();
	}
	
	public void EnterDetailsinServerTab(String MaxConnwaitforRead, String MaxpoolforRead, String MaxwaitforReply, String QueueLeng) {
		MaxConnWaitforRead.sendKeys(MaxConnwaitforRead);
		MaxPoolforRead.sendKeys(MaxpoolforRead);	
		MaxWaitforReply.sendKeys(MaxwaitforReply);
		QueueLength.sendKeys(QueueLeng);
		
	}
	
	public void clickSave() {
		Save.click();
	}

}
