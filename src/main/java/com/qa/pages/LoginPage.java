package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends BaseTest 
{
	TestUtils utils = new TestUtils();
	//*[contains(@content-desc,'New in for you')]

	@AndroidFindBy (xpath = "//android.widget.Button[@content-desc=\"Accept all\"]") 
	@iOSXCUITFindBy (id = "test-Username")
	private MobileElement AcceptBtn;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@content-desc=\"Continue as Guest\"]") 
	@iOSXCUITFindBy (id = "test-Username")
	private MobileElement continueGuest;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@content-desc=\"Next\"]") 
	@iOSXCUITFindBy (id = "test-Username")
	private MobileElement NextBtn;

	@AndroidFindBy (xpath = "//android.widget.Button[@content-desc='Enable']") 
	@iOSXCUITFindBy (id = "test-Username")
	private MobileElement PushNotification;
	
	@AndroidFindBy (xpath = "//android.widget.Button[@content-desc=\"Get Started\"]") 
	@iOSXCUITFindBy (id = "test-Username")
	private MobileElement GetStarted;
	
	@AndroidFindBy (xpath = "//android.widget.EditText[@text='Email Address']") 
	@iOSXCUITFindBy (id = "test-Username")
	private MobileElement usernameTxtFld;

	@AndroidFindBy (xpath = "//android.widget.EditText[@text='Password']") 
	@iOSXCUITFindBy (id = "test-Password")
	private MobileElement passwordTxtFld;
	
	@AndroidFindBy (accessibility = "//android.widget.Button[@content-desc=\"Sign in\"]") 
	@iOSXCUITFindBy (id = "test-LOGIN")
	private MobileElement loginBtn;
	
	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView") 
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
	private MobileElement errTxt;
	

	
public LoginPage cookies() 
{
	//LoginPage lp=new LoginPage();
	click(AcceptBtn,"click on Accept all");
	click(continueGuest,"click on continue as guest");
	click(NextBtn,"click on Next button");
	click(PushNotification,"click on Push notification");
	click(GetStarted,"click on get started");
	
	return this;
	
}
public LoginPage enterUserName(String username)
{
	click(usernameTxtFld,"click on username field");
	clear(usernameTxtFld);	
	sendKeys(usernameTxtFld, username, "login with " + username);
	return this;
}

public LoginPage enterPassword(String password) 
{
	click(passwordTxtFld,"click on password field");
	clear(passwordTxtFld);
	sendKeys(passwordTxtFld, password, "password is " + password);
	return this;
}



public String getErrTxt()
{
	String err = getText(errTxt, "error text is - ");
	return err;
}

	
	 public MobileElement scrollToElement() 
	 {	  
			return (MobileElement) ((FindsByAndroidUIAutomator) getDriver()).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
							+ "new UiSelector().description(\"New in for you\"));");
	  }
	
		
	 public MobileElement scrollToElemenText() 
	 {	  
			return (MobileElement) ((FindsByAndroidUIAutomator) getDriver()).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
							+ "new UiSelector().text(\"New in for you\"));");
	  }

}
