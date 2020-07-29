package com.webui.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.webui.qa.util.TestUtil;
import com.webui.qa.util.WebEventListener;

public class TestBase implements WebDriverScience{

	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	// create a constructor 
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/Karthik/eclipse-workspace/WebUIMSSQL/src/main/java/com/webui/qa/config/config.properties");
			prop.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization() {
	String browserName = prop.getProperty("browser");
	if (browserName.equals("chrome")) {
			   System.setProperty("webdriver.chrome.driver", "/Users/Karthik/eclipse-workspace/CucumberBanking/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}
	
	e_driver = new EventFiringWebDriver(driver);
	// Now create object of EventListerHandler to register it with EventFiringWebDriver
	eventListener = new WebEventListener();
	e_driver.register(eventListener);
	driver = e_driver;
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
	}
	public static Logger log =  Logger.getLogger(TestBase.class);

	public WebElement locateElement(String locator, String locValue) {
		// TODO Auto-generated method stub
		return null;
	}
	public void type(WebElement ele, String data) {
		// TODO Auto-generated method stub
		
	}
	public void click(WebElement ele) {
		// TODO Auto-generated method stub
		
	}
	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}
	public void selectDropDownUsingVisibleText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		
	}
	public boolean verifyExactTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean verifyPartialTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}
	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		
	}
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		
	}
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		
	}
	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		
	}
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		
	}
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}
	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}
	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}
	public void closeActiveBrowser() {
		// TODO Auto-generated method stub
		
	}
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
	}
	
}
