package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.LoginPage;

import com.qa.utils.TestUtils;

import io.appium.java_client.android.AndroidDriver;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.InputStream;
import java.lang.reflect.Method;

public class LoginTests extends BaseTest{
	LoginPage loginPage;
	
	JSONObject loginUsers;
	TestUtils utils = new TestUtils();
	
	  @BeforeClass
	  public void beforeClass() throws Exception {
			InputStream datais = null;
		  try {
			  String dataFileName = "data/loginUsers.json";
			  datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
			  JSONTokener tokener = new JSONTokener(datais);
			  loginUsers = new JSONObject(tokener);
		  } catch(Exception e) {
			  e.printStackTrace();
			  throw e;
		  } finally {
			  if(datais != null) {
				  datais.close();
			  }
		  }
		  /*closeApp();
		  launchApp();*/
	  }

	  @AfterClass
	  public void afterClass() 
	  {
		  
	  }
	  
	  @BeforeMethod
	  public void beforeMethod(Method m) {
		  utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
		  loginPage = new LoginPage();
	  }

	  @AfterMethod
	  public void afterMethod() 
	  {	
		  
		  
	  }
	  
	   @Test
	  public void AcceptCookies() throws Exception 
	  {
		 
		   loginPage.cookies();
		 
		 
	  }
	  
	 
}
