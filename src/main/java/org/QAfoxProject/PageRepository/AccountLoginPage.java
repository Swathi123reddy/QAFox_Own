package org.QAfoxProject.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPage {
	/**1.Declaration of webElement
	 */
		@FindBy(xpath= "//input[@id='input-email']")
		private WebElement emailaddressTextField;
		
		@FindBy(xpath = "//input[@id='input-password']")
		private WebElement passwordTextField;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement loginbutton;
		
		public AccountLoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
				
				public WebElement getemailaddressTextField() {
					return emailaddressTextField;
				}
				public WebElement getpasswordTextField() {
					return passwordTextField;
				}
				public WebElement getloginbutton() {
					return loginbutton;
				}

}
