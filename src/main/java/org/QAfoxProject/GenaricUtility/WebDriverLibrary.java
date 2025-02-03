package org.QAfoxProject.GenaricUtility;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import java.time.Duration;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
///***
// * this class contains reusable methods to perform driver related operations
// * 
// * @author plali
// */
public class WebDriverLibrary {
//	public WebDriver driver;
//	public static WebDriver static_driver;
//	public Actions action;
//	public Select select;
//
//	/**
//	 * this method launches specific browser
//	 * 
//	 * @param
//	 * 
//	 * @return
//	 * 
//	 */
//	public WebDriver launchBrowser(String browser) {
//		switch (browser) {
//		case "chrome":
//			driver = new ChromeDriver();
//			static_driver = driver;
//			break;
//
//		case "firefox":
//			driver = new FirefoxDriver ();
//			static_driver = driver;
//			break;
//
//		case "edge":
//			driver = new EdgeDriver();
//			static_driver = driver;
//			break;
//		default:
//			System.out.println("Invalid browser info");
//		}
//		return driver;
//
//	}
//
//	/**
//	 * this method maximize the browser
//	 */
//	public void maximizeBrowser() {
//		driver.manage().window().maximize();
//	}
//
//	/**
//	 * this method navigate to Application
//	 * 
//	 * @param url
//	 */
//	public void navigateToApp(String url) {
//		driver.get(url);
//	}
//
//	/**
//	 * this method used to close the browser
//	 * 
//	 */
//	public void closeBrowser() {
//		driver.close();
//	}
//
//	/**
//	 * this method used to close all the browser window/tab
//	 *
//	 */
//	public void closeAllBrowser() {
//		driver.close();
//	}
//
//	/**
//	 * this method used to waitUntilElementFound
//	 *
//	 */
//	public void waitUntilElementFound() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PathConstant.DURATION));
//	}
//
//	/**
//	 * this method waits until element is visible on the web page
//	 * 
//	 * @param time
//	 * @param element
//	 * @return
//	 */
//	public void waitUntilElementFound(WebElement element) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(PathConstant.DURATION));
//		wait.until(ExpectedConditions.visibilityOf(element));
//
//	}
//
//	/**
//	 * this method is used to mouse hover on an element
//	 *
//	 * @param element
//	 */
//	public void mouseHoverToElement(WebElement element) {
//		action = new Actions(driver);
//		action.moveToElement(element).perform();
//	}
//
//	/**
//	 * this method is used to double click the element
//	 * 
//	 * @param element
//	 */
//	public void doubleClickOnElement(WebElement element) {
//		action = new Actions(driver);
//		action.doubleClick(element).perform();
//	}
//
//	/**
//	 * this method is used to right click the element
//	 * 
//	 * @param element
//	 */
//	public void rightClickOnElement(WebElement element) {
//		action = new Actions(driver);
//		action.contextClick(element).perform();
//	}
//	
//	/**
//	 * this method is used to drag and drop  an element to target location
//	 * @param element
//	 * @param target
//	 */
//	public void dragAndDropElement(WebElement source, WebElement target) {
//		action = new Actions(driver);
//		action. dragAndDrop(source, target).perform();
//	}
//	/**
//	 * this method is used select from  drop drown  
//	 * @param element
//	 * @param target
//	 */
//	public void selectFromDropDown(WebElement element, int index) {
//		select = new Select(element);
//		select. selectByIndex(index);
//	}
//	/**
//	 * this method is used select from  drop drown  
//	 * @param element
//	 * @param target
//	 */
//	public void selectFromDropDown(String visibletext, WebElement element) {
//		select = new Select(element);
//		select. selectByVisibleText(visibletext);
//	}
//	/**
//	 * this method is used   
//	 * @param element
//	 * @param target
//	 */
//	public void switchToFrame(int index) {
//		driver.switchTo().frame(index);
//	}
//	/**
//	 * this method is used select from  drop drown  
//	 * @param element
//	 * @param target
//	 */
//	public void switchToFrame(String idOrName) {
//		driver.switchTo().frame(idOrName);
//		
//	}
//	/**
//	 * this method is used select   
//	 * @param element
//	 * @param target
//	 */
//	public void switchToFrame(WebElement element) {
//		driver.switchTo().frame(element);
//	}
//	/**
//	 * this method is used switch back to default window  
//	 * @param element
//	 * @param target
//	 */
//	public void switchToDefaultWindow() {
//		driver.switchTo().defaultContent();
//	}
//	/**
//	 * this method is used switch back to parent frame  
//	 * @param element
//	 * @param target
//	 */
//	public void switchToParentFrame() {
//		driver.switchTo().parentFrame();
//	}
//	/**
//	 * this method is used to handle Alert 
//	 * @param element
//	 * @param target
//	 */
//	public void handleAlert(String status) {
//		Alert al = driver.switchTo().alert();
//		if(status.equalsIgnoreCase("ok"))
//			al.accept();
//		else
//			al.dismiss();
//	}
//	/**
//	 * this method converts dynamic xpath to webElement 
//	 * @param commonPath
//	 * @param replaceData
//	 */
//	public WebElement convertDynamixXpathWebElement(String commonPath, String replaceData){
//		String requiredPath = String.format(commonPath, replaceData);
//		return driver.findElement(By.xpath(requiredPath));
//	}
//
//
	public WebDriver driver;
	public static WebDriver static_driver;
	public Actions action;
	public Select select;
	/**
	 * this method launches specified browser
	 * @param browser
	 * @return
	 */
	public WebDriver launchBrowser(String browser) {
		switch(browser) {
		case "chrome":
			driver=new ChromeDriver();
			static_driver=driver;
			break;
		case "firefox":
			driver=new FirefoxDriver();
			static_driver=driver;
			break;
		case "edge":
			driver=new EdgeDriver();
			static_driver=driver;
			break;
			default:
				System.out.println("invalid browser info");
		}
		return driver;
	}
	/**
	 * this method maximize the browser 
	 */
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	/**
	 * this method is used to navigate to the application
	 * @param url
	 */
	public void navigateToApp(String url) {
		driver.get(url);
	}
	/**this method is used to close the browser
	 */
	public void closeTheBrowser() {
		driver.close();
	}
	/**this method is used to close all the browser window/tab
	 */
	public void closeAllBrowsers() {
		driver.quit();
	}
	/**this method is used to wait the statement until element will found 
	 */
	public void waitUntilElementFound() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PathConstant.DURATION));
	}
	/**
	 * this method waits until element is visible on the web page
	 * @param time
	 * @param element
	 * @return
	 */
	public void waitUntilElementFound(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(PathConstant.DURATION));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * this method is used to mouse hover on an element
	 * @param element
	 */
	public void mouseHoverToElement(WebElement element) {
		action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	/**
	 * this method is used to double click on an element
	 * @param element
	 */
	public void doubleClickOnElement(WebElement element) {
		action=new Actions(driver);
		action.doubleClick(element).perform();
	}
	/**this method is used to right click on an element
	 * @param element
	 */
	public void rightClickOnElement(WebElement element) {
		action=new Actions(driver);
		action.contextClick(element).perform();
	}
	/**this method is used to drag and drop on an element
	 * @param source
	 * @param target
	 */
	public void dragAndDropElement(WebElement source, WebElement target) {
		action=new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}
	/**this method is used to select an element to drop down based on index
	 * @param element
	 * @param index
	 */
	public void selectFromDropDown(WebElement element, int index) {
		select=new Select(element);
		select.selectByIndex(index);
	}
	/**this method is used to select an element to drop down based on index
	 * @param element
	 * @param index
	 */
	public void selectFromDropDown(WebElement element, String value) {
		select=new Select(element);
		select.selectByValue(value);
	}
	/**this method is used to select an element to drop down based on index
	 * @param element
	 * @param index
	 */
	public void selectFromDropDown(String text, WebElement element) {
		select=new Select(element);
		select.selectByVisibleText(text);
	}
	/**
	 * this method is used to switch to frame based on index
	 * @param index 
	 */
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * this method is used to switch to frame based on attribute value
	 * @param idOrName
	 */
	public void switchToFrame(String idOrName) {
		driver.switchTo().frame(idOrName);
	}
	/**
	 * this method is used to switch to frame based on element
	 * @param element
	 */
	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	/**this method is used to switch back to default window
	 */
	public void switchToDefaultWindow() {
		driver.switchTo().defaultContent();
	}
	/**this method is used to switch back to parent window/frame
	 */
	public void switchToParentWindow() {
		driver.switchTo().parentFrame();
	}
	/**this method handles alert pop up
	 * @param status
	 */
	public void handleAlert(String status) {
		Alert al= driver.switchTo().alert();
		if(status.equalsIgnoreCase("ok"))
			al.accept();
		else
			al.dismiss();
	}
	/**this method converts dynamic xpath to webElement(it will replace the xpath)
	 * @param commonPath
	 * @param replaceData
	 * @return
	 */
	public WebElement convertDynamicXpathToWebElement(String commonPath, String replaceData) {
		String requiredPath=String.format(commonPath, replaceData);
		return driver.findElement(By.xpath(requiredPath));
	}
	
}
