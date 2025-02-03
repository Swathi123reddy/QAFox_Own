package org.QAfoxProject.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class HomePage {
	 
	//to create account
		@FindBy(xpath="//a[@title='My Account']")
		private WebElement myaccount_headerlink;

		//to register account
		@FindBy(xpath="//a[text()='Register']")
		private WebElement register_headerlink;

		//to login the page
		@FindBy(xpath="//a[text()='Login']")//u1[contains(@class,'dropdown-menu')]/li/a[text()='Login']
		private WebElement login_headerlink;

		//to perform desktop
		@FindBy(xpath = "//a[text()='Desktops']")
		private WebElement desktop_headertext;

		//to perform desktop
		@FindBy(xpath = "//a[text()='Mac (1)']")
		private WebElement desktop_Macheadertext;

		//to perform PC in desktop
		@FindBy(xpath="//a[text()='PC (0)']")
		private WebElement desktop_Pcheadertext;

		//to perform components
		@FindBy(xpath="//a[text()='Components']")
		private WebElement Components_headertext;

		//to perform mice components
		@FindBy(xpath="//a[text()='Mice and Trackballs (0)']")
		private WebElement Components_Miceheadertext;

		//to perform monitor components
		@FindBy(xpath="//a[text()='Monitors (2)']")
		private WebElement Components_Monitorheadertext;


		//to perform printer components
		@FindBy(xpath="//a[text()='Printers (0)']")
		private WebElement Components_Printerheadertext;

		//to perform scanner components
		@FindBy(xpath="//a[text()='Scanners (0)']")
		private WebElement Components_Scannerheadertext;

		//to perform web cameras components
		@FindBy(xpath="//a[text()='Web Cameras (0)']")
		private WebElement Components_WebCamerasheadertext;

		//to perform mp3 
		@FindBy(xpath="//a[text()='MP3 Players']")
		private WebElement MP3_Playersheadertext;

		//to perform mp3
		@FindBy(xpath="//a[text()='test 18 (0)']")
		private WebElement MP3_test18_headertext;
		
		//to perform mp3
			@FindBy(xpath="//a[text()='test 15 (0)']")
			private WebElement MP3_test15_headertext;

		//to perform shoppingcart
		@FindBy(xpath="//a[@title='Shopping Cart']")
		private WebElement shoppingcart_headertext;

		//to perform checkout in home page
		@FindBy(xpath="//a[@title='Checkout']")
		private WebElement desktop_CheckOutheadertext;

		//to perform account in home
		@FindBy(xpath="//span[text()='My Account']")
		private WebElement MyAccount_headertext;

		//to perform logout
		@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Logout']")
		private WebElement logout_headertext;
		//---------------------------------------------------------------------------------


			public HomePage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

			/**
			 * @return the myaccount_headerlink
			 */
			public WebElement getMyaccount_headerlink() {
				return myaccount_headerlink;
			}

			/**
			 * @return the register_account
			 */
			public WebElement getRegister_account() {
				return register_headerlink;
			}

			/**
			 * @return the login_account
			 */
			public WebElement getLogin_headeraccount() {
				return login_headerlink;
			}
			
			/**
			 * @return the desktop_headertext
			 */
			public WebElement getDesktop_headertext() {
				return desktop_headertext;
			}

			/**
			 * @return the desktop_button
			 */
			public WebElement getDesktop_Macheadertext() {
				return desktop_Macheadertext;
			}

			/**
			 * @return the desktop_Pcheadertext
			 */
			public WebElement getDesktop_Pcheadertext() {
				return desktop_Pcheadertext;
			}
			
			/**
			 * @return the components_headertext
			 */
			public WebElement getComponents_headertext() {
				return Components_headertext;
			}
			

			/**
			 * @return the components_Miceheadertext
			 */
			public WebElement getComponents_Miceheadertext() {
				return Components_Miceheadertext;
			}
			

			/**
			 * @return the components_Monitorheadertext
			 */
			public WebElement getComponents_Monitorheadertext() {
				return Components_Monitorheadertext;
			}
			
			

			/**
			 * @return the components_Printerheadertext
			 */
			public WebElement getComponents_Printerheadertext() {
				return Components_Printerheadertext;
			}

			/**
			 * @return the components_Scannerheadertext
			 */
			public WebElement getComponents_Scannerheadertext() {
				return Components_Scannerheadertext;
			}

			/**
			 * @return the components_WebCamerasheadertext
			 */
			public WebElement getComponents_WebCamerasheadertext() {
				return Components_WebCamerasheadertext;
			}

			
			/**
			 * @return the mP3_Playersheadertext
			 */
			public WebElement getMP3_Playersheadertext() {
				return MP3_Playersheadertext;
			}

			/**
			 * @return the mP3_test18_headertext
			 */
			public WebElement getMP3_test18_headertext() {
				return MP3_test18_headertext;
			}
			
			

			/**
			 * @return the shoppingcart_headertext
			 */
			public WebElement getShoppingcart_headertext() {
				return shoppingcart_headertext;
			}


			/**
			 * @return the desktop_CheckOutheadertext
			 */
			public WebElement getDesktop_CheckOutheadertext() {
				return desktop_CheckOutheadertext;
			}

			/**
			 * @return the myAccount_headertext
			 */
			public WebElement getMyAccount_headertext() {
				return MyAccount_headertext;
			}

			/**
			 * @return the logout_headertext
			 */
			public WebElement getLogout_headertext() {
				return logout_headertext;
			}

			/**
			 * @return the register_headerlink
			 */
			public WebElement getRegister_headerlink() {
				return register_headerlink;
			}

			/**
			 * @return the login_headerlink
			 */
			public WebElement getLogin_headerlink() {
				return login_headerlink;
			}

			public WebElement getMP3_test15_headertext() {
				return MP3_test15_headertext;
			}
 }

