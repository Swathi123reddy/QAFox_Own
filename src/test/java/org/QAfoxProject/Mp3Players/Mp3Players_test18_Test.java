//package org.QAfoxProject.Mp3Players;
//
//public class Mp3Players_test18_Test {
//	
//	import org.qafox.GenericUtility.BaseConfiguration;
//
//	import org.qafox.PageRepository.HomePage;
//
//	import org.testng.Assert;
//
//	import org.testng.Reporter;
//
//	import org.testng.annotations.Test;
//	 
//	import com.aventstack.extentreports.Status;
//	 
//	public class SoftWareTest extends BaseConfiguration {
//	 
//		@Test(enabled = true, groups = "Sanity", invocationCount = 3)
//
//		public void click_On_Software() {
//
//			test = report.createTest("verify-clicked on software product");
//	 
//			HomePage homepage = new HomePage(webdriverobj.driver);
//	 
//			// perform mouse hover action on printers
//
//			webdriverobj.mouseHoverToElement(homepage.getSoftware_text());
//	 
//			javautilityobj.pause(5000);
//	 
//			Reporter.log("clicked on Software", true);
//	 
//			homepage.getSoftware_text().click();
//
//			javautilityobj.pause(5000);
//
//			test.log(Status.PASS, " 2.1 clicked on software text");
//	 
//			String actualconenttext = homepage.getSoftware_content().getText();
//
//			String expectedconenttext = "Software";
//	 
//			Assert.assertEquals(actualconenttext, expectedconenttext);
//	 
//			test.log(Status.PASS, "2.1.1 test passed");
//	 
//		}
//	 
//		@Test(enabled = false, groups = "Sanity", invocationCount = 3)
//
//		public void blank_Details() {
//
//			Reporter.log("There are no products to list in this category", true);
//
//		}
//	 
//	}
//
//	 
//
//}
