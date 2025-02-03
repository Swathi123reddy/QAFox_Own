package org.QAfoxProject.ListenerFeature;

import java.io.File;
import java.io.IOException;

import org.QAfoxProject.GenaricUtility.BaseConfiguration;
import org.QAfoxProject.GenaricUtility.WebDriverLibrary;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.QAfoxProject.GenaricUtility.BaseConfiguration;
//import org.QAfoxProject.GenaricUtility.WebDriverLibrary;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.testng.IRetryAnalyzer;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//import org.testng.Reporter;
//
public class ListenerImplimantaion extends BaseConfiguration implements ITestListener ,IRetryAnalyzer{
//
//	@Override
//	public void onTestStart(ITestResult result) {
//		
//		Reporter.log("onTestStart",true);
//	}
//
//	@Override
//	public boolean retry(ITestResult result) {
//		
//		
//		
//		int count = 1;
//		int retryuntil = 2;
//		boolean flag = false;
//		
//		
//		if(count < retryuntil)
//		{
//			Reporter.log("Retry...!",true);
//			count++;
//			flag=true;
//		}
//		
//		return flag;
//	}
//
//	@Override
//	public void onTestSuccess(ITestResult result) {
//		
//		Reporter.log("onTestSuccess",true);
//		
//	}
//
//	@Override
//	public void onTestFailure(ITestResult result) {
//		
//		Reporter.log("onTestFailure",true);
//		
//		//fetch the test method name
//		String methodname = result.getName();
//		
//		//perform typecasting
//		TakesScreenshot ts = (TakesScreenshot)WebDriverLibrary.static_driver;
//		
//		//call the screenshot method
//		
//		//store the screenshot in temp path
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		
//		//using timestamp
//		String timestamp = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss").format(new Date());
//		
//		
//		//create permanent path
//		File destination = new File("./TestScreenshot/"+methodname + javautilityobj.getCurrentTime() +".png");
//		
//		//copy the screenshot from temp to permanent path
//		try {
//			org.openqa.selenium.io.FileHandler.copy(source, destination);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public void onTestSkipped(ITestResult result) {
//		
//		Reporter.log("onTestSkipped",true);
//	}
//
//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		
//		Reporter.log("onTestFailedButWithinSuccessPercentage",true);
//	}
//
//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//
//		Reporter.log("onTestFailedWithTimeout",true);
//	}
//
//	@Override
//	public void onStart(ITestContext context) {
//		
//		Reporter.log("onStart",true);
//	}
//
//	@Override
//	public void onFinish(ITestContext context) {
//		
//		Reporter.log("onFinish",true);
//	}
	
	
	int count=1;
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("on test start",true);	
	}
	@Override
	public boolean retry(ITestResult result) {
		int retryuntil=5;
		boolean flag=false;
		if(count<=retryuntil) {
			Reporter.log("Retry",true);
			count++;
			flag= true;
		}
return flag;
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("on test success",true);
		
		}
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("on test failure",true);
		String methodname=result.getName();
		TakesScreenshot ts=(TakesScreenshot) WebDriverLibrary.static_driver;
		File source = ts.getScreenshotAs(OutputType.FILE);		
		File destination=new File("./TakeScreenshot/"+methodname+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("on test skipped",true);
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("on Test Failed But With in Success Percentage",true);
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("on test failed with timeout",true);
	}
	@Override
	public void onStart(ITestContext context) {
		Reporter.log("on start",true);
	}
	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("on finish",true);
	}
}


