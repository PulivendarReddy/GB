package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage extends BaseTest 
{
	TestUtils utils = new TestUtils();
	//*[contains(@content-desc,'New in for you')]

	@AndroidFindBy (xpath = "//android.widget.Button[@content-desc=\"Accept all\"]") 
	@iOSXCUITFindBy (id = "test-Username")
	private MobileElement AcceptBtn;
	
	
	
	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView") 
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
	private MobileElement errTxt;
	

	
public String scrolltodown() 
{
	HomePage hp=new HomePage();
	
	return getcontentText(hp.scrollToElement(),"scrolled into ");

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
							+ "new UiSelector().description(\"Your Favorite new arrivals\"));");
	  }
	
		
	 public MobileElement scrollToElemenText() 
	 {	  
			return (MobileElement) ((FindsByAndroidUIAutomator) getDriver()).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
							+ "new UiSelector().text(\"New in for you\"));");
	  }

}
