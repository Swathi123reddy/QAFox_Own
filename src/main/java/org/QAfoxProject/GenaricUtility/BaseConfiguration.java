package org.QAfoxProject.GenaricUtility;

import org.QAfoxProject.PageRepository.AccountLoginPage;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseConfiguration {

	
	public WebDriverLibrary webdriverobj;
	public ExcelFileLibrary excelutilityobj;
	public PropertyFileLibrary propertyfileobj;
	public JavaLibrary javautilityobj;
	public JavaScriptLibrary jsutilityobj;
	public TakesScreenshotLibrary tsutilityobj;
	
	/**
	 * This method used to configure the browser setup
	 * @param
	 **/
	@BeforeClass
	public void browserSetup()
	{
		//initialize all the libraries
		initobjects();
		
		String browser = "chrome";
		String url = "https://tutorialsninja.com/demo/";
		//Test Log
		
		//precondition 1: Launch the browser
		webdriverobj.launchBrowser(browser);
		Reporter.log("Browser launched successfully", true);
		
		//precondition 2: Navigate to the application
		webdriverobj.navigateToApp(url);
		Reporter.log("Browser navigated successfully", true);
		
		//precondition 3: maximize the browser
		
		webdriverobj.maximizeBrowser();
		Reporter.log("Browser maximized successfully", true);
		
		HomePage homeobj = new HomePage(webdriverobj.driver);
		
		//Click on My Account Header link
		homeobj.getMyaccountlink().click();
		Reporter.log("Clicked on My Account header link successfull",true);
	
		//Click on Login Header link
//		homeobj.getLoginbutton().click();
//		Reporter.log("Clicked on login button link successfull",true);
		
		 homeobj.getRegisterbutton();
	}
	
	/**
	 * This method used to configure the browser termination
	 
	 **/
	@AfterClass
	public void browserTerminate()
	{
		//Test Log
		//Postcondition 1 : close the browser
		webdriverobj.closeAllBrowser();
		Reporter.log("Browser terminated successfully", true);
	}
	
	/**
	 * This method used to perform the login activity
	 
	 **/
	@BeforeMethod(enabled = false)
	public void login()
	{
		String username = "pragnya1234@gmail.com";
		String password = "Abc@123";
		//Test Log
		//Provide wait statement
		webdriverobj.waitUntilElementfound();
		

		AccountLoginPage loginobj = new AccountLoginPage(webdriverobj.driver);
		
		loginobj.getLoginButton().click();
		
		loginobj.getEmailtextfield().sendKeys(username);
		
		loginobj.getPasswordtextfield().sendKeys(password);;
		
		loginobj.getLoginButton().click();
		
		Reporter.log("logged in successfully", true);
	}
	
	/**
	 * This method used to perform the logout activity
	 * @param
	 **/
	@AfterMethod()
	public void logout()
	{
		//Test Log
		Reporter.log("logged out successfully", true);
	}
	
	/**
	 * This method used to configure the TestRunner level configuration

	 **/
	@BeforeTest
	public void getTestRunnerConnection()
	{
		//Test Log
		Reporter.log("TestRunner connected successfully", true);
	}
	
	/**
	 * This method used to terminate the TestRunner level configuration
	 * @param
	 **/
	@AfterTest
	public void terminateTestRunnerConnection()
	{
		//Test Log
		Reporter.log("TestRunner terminated successfully", true);
	}
	
	/**
	 * This method used to configure the Database or Advance report connection
	 * @param
	 **/
	@BeforeSuite
	public void getReportConnection()
	{
		//Test Log
		Reporter.log("getting report connection successfully", true);
	}
	
	/**
	 * This method used to terminate the Database or Advance report connection
	 * @param
	 **/
	@AfterSuite
	public void terminateReportConnection()
	{
		//Test Log
		Reporter.log("terminate report connection successfully", true);
		
	}
	
	public void initobjects()
	{
		webdriverobj = new WebDriverLibrary();
		excelutilityobj = new ExcelFileLibrary();
		propertyfileobj = new PropertyFileLibrary();
		javautilityobj = new JavaLibrary();
		jsutilityobj = new JavaScriptLibrary();
		tsutilityobj = new TakesScreenshotLibrary();
	}

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}



