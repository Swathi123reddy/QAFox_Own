package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.opentelemetry.api.incubator.trace.ExtendedSpanBuilder;

public class DemoTask {
	@Test
	
	public void demoTask1() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReports/report.html ");
		//configure the sparkReport Information
		spark.config().setDocumentTitle("FunctionalityTest||QAFox");
		spark.config().setReportName("FunctionalitySuite||Verify User Able to Add Desktop-Mac-Product");
		spark.config().setTheme(Theme.STANDARD);
		
		//create the extent report
		ExtentReports report=new ExtentReports();
		
		//attach the spark report and extentReport
		report.attachReporter(spark);
		
		//configure the system information in extent report
		report.setSystemInfo("DeviceName:","Swathi");
		report.setSystemInfo("OperatingSystem","WINDOWS 11");
		report.setSystemInfo("Browser:","Chrome");
		report.setSystemInfo("BrowserVersion:","Chrome-131.0.6778.264");
		
		//create test information
		ExtentTest test=report.createTest("FunctionalityTest");
		
		//steps information
		test.log(Status.INFO," Step1:Launching The Browser Succesfully");
		test.log(Status.INFO," Step2:Navigate Application via Url Sucessfully");
		test.log(Status.PASS," Step3:Verified the WebPage Successfully");
		
		if("Swathi".equals("Swathi")) {
			test.log(Status.PASS, "Step4:Verified the WebElements Dispolayed");
			
		}
		else {
			test.log(Status.FAIL, "Step4:Verified the WebElements Not Dispolayed");
			
		}
	//test.log(Status.Skip,"Step5:Element is Hidden");
		//Flush the Report Information
		report.flush();
		System.out.println("execution done");
		

}
}
