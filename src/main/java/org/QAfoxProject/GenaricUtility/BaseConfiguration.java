package org.QAfoxProject.GenaricUtility;

import org.QAfoxProject.PageRepository.AccountLoginPage;
import org.QAfoxProject.PageRepository.HomePage;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseConfiguration {
	public WebDriverLibrary webdriverobj;
	public ExcelFileLibrary excelfileobj;
	public PropertyFileLibrary propertyfileobj;
	public JavaLibrary javautilityobj;
	public JavaScriptLibrary javascriptobj;
	public TakesScreenshotLibrary takescreenshotobj;
	
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
/**
 * This Method Used To Configure The Browser Setup
 * @param
 */
	@BeforeClass
	public void browserSetup() {
		initobjects();
		String browser="chrome";
		String url="https://tutorialsninja.com/demo/";
	
		//test log
		webdriverobj.launchBrowser(browser);
		//precondition1:launch the browser
		Reporter.log("Browser Launch Successfully",true);
		
		webdriverobj.navigateToApp(url);
		//precondition2:navigate to the application
		Reporter.log("Browser navigate Successfully",true);
		
	
		//precondition3: maximize the browser
		webdriverobj.maximizeBrowser();
		Reporter.log("Browser maximize Successfully",true);
		
		
		HomePage homeobj=new HomePage(webdriverobj.driver);
		//click on "my account" header link
		homeobj.getMyaccount_headerlink().click();
		Reporter.log("clicked on my account hearder link successful", true);
		//click on register header link
		//homeobj.getRegister_account();
		//Reporter.log("clicked on register account hearder link successful", true);
		//click on login register
		homeobj.getLogin_headeraccount().click();
		Reporter.log("clicked on login account hearder link successful", true);
	}
	/**
	 * This Method Used To Configure The Browser termination
	 * @param
	 */
		@AfterClass
	public void browserTermination() {
			webdriverobj.closeAllBrowsers();
			//test log
		Reporter.log("Browser terminate Successfully",true);
			
		}
	/**
	 * This Method Used To Configure The browser termination
	 * @param
	 **/
		@BeforeMethod(enabled = true)
		public void login() {
			String username = "ramadevidasari572@gmail.com";
			String password = "Ramadevi@123";
			//provide wait statement
			webdriverobj.waitUntilElementFound();
			
			AccountLoginPage loginobj=new AccountLoginPage(webdriverobj.driver);
			loginobj.getemailaddressTextField().sendKeys(username);
			//enter password
			loginobj.getpasswordTextField().sendKeys(password);
			//click login
			loginobj.getloginbutton().click();
			Reporter.log("Login Successfully",true);
		}
	/**
	 * This Method Used To Configure The Browser Terminated
	 **/
		@AfterMethod(enabled = true)
		public void logout() {
			Reporter.log("logout Successfully",true);
			HomePage homeobj=new HomePage(webdriverobj.driver);
			homeobj.getMyAccount_headertext().click();
			homeobj.getLogout_headertext().click();
		}
	/**
    * This Method Used To Configure The TestRunner level Connection
	* @param
    * */
		@BeforeTest
			public void getTestRunnerConnection() {
				Reporter.log("Test Runner Successfully",true);
			}
			/**
			 * This Method Used To terminate testrunner connection
			 * @param
			 * */
		@AfterTest
		public void terminateTestRunnerConnection() {
			Reporter.log("terminate Test Runner Successfully",true);
			
			
		}
		/**
		 * This Method Used To get/configure the database or advance report connection
		 * @param
		 * */
		@BeforeSuite
			public void getReportConnection() {
			//create the sparkReport
			spark=new ExtentSparkReporter("./AdvanceReports/report.html");
			
			
			//configure the sharkReport information
			spark.config().setDocumentTitle("FunctionalityTest||QaFox");
			spark.config().setReportName("FunctionalitySuite||Verify user able to add desktop-Mac-Product");
			spark.config().setTheme(Theme.STANDARD);
			
			
			//CREATE THE EXTENT REPORT
			report=new ExtentReports();
			
			//ATTACH THE SPARK REPORT AND EXTENT REPORT
			report.attachReporter(spark);
			
			//CONFIGURE THE SYSTEM INFORMATION IN EXTENT REPORT
			report.setSystemInfo("DeviceName:", "soujanya");
			report.setSystemInfo("OperatingSystem:", "WINDOWS11");
			report.setSystemInfo("Browser:", "Chrome");
			report.setSystemInfo("BrowserVersion:", "131.0.6778.205");
				Reporter.log("Getting ReportConnection Successfully",true);
			}
			/**
			 * This Method Used To terminate connection
			 * @param
			 * */
		@AfterSuite
			public void terminationReportConnection() {
			//flush the report information
			report.flush();
			
				Reporter.log("Terminate ReportConnection Successfully",true);
			}
		public void initobjects() {
			webdriverobj=new WebDriverLibrary();
			excelfileobj=new ExcelFileLibrary();
			propertyfileobj=new PropertyFileLibrary();
			javautilityobj=new JavaLibrary();
			javascriptobj=new JavaScriptLibrary();
			takescreenshotobj=new TakesScreenshotLibrary();
		}
}

	
	