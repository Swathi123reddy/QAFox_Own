package org.QAfoxProject.GenaricUtility;

/**
 * this class contains reusable methods to perform java related operations 
 * @author lalitha
 */

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptLibrary {
	public JavascriptExecutor javascriptobj;

	/**
	 * this method is used to enter the data in disabled element
	 * 
	 * @param element
	 * @param data
	 */
	public void enterData_DisabledElement(WebElement element, String data) {
		javascriptobj = (JavascriptExecutor) WebDriverLibrary.static_driver;
		javascriptobj.executeScript("arguments[0].value='+data+'", element);
	}

	/**
	 * this method is used to perform click the disabled element
	 * 
	 * @param element
	 */

	public void click_DisabledElement(WebElement element) {
		javascriptobj = (JavascriptExecutor) WebDriverLibrary.static_driver;
		javascriptobj.executeScript("arguments[0].click()", element);
	}
	/**
	 * this method used to scroll on webpage
	 */
	public void defaultVerticalScrollBy() {
		javascriptobj = (JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("window.scrollBy(1000,1000)");
	}
	
	/**
	 * this method is used to Scroll to webpage
	 */
	public void defaultVerticalScrollTo() {
		javascriptobj = (JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("window.scrollBy(1000,1000)");
	}
	/**
	 * this method used to scroll untill
	 */
	public void scrollUsingView(WebElement element, boolean value) {
		javascriptobj = (JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("arguments[0].scrollIntoView("+ value + ");",element);
	}

}