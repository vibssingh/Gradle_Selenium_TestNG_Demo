package org.example.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.pageobjectmodel.HomePage;
import org.example.pageobjectmodel.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {
	 

	@Severity(SeverityLevel.NORMAL)
    @Test(description = "This test validates error message when credentials are incorrect", priority = 0)
	@Description("Test Description : Login Test with invalid credentials")
    public void invalidCredentials() {
   
	    LoginPage objLoginPage = new LoginPage(driver);
    	objLoginPage.login("Admin", "admin123$$");
    	 
    	// Verify Error Message
    	 Assert.assertEquals(objLoginPage.getErrorMessage(),"Invalid credentials");
    
    }
    
	@Severity(SeverityLevel.BLOCKER)
    @Test(description = "This test validates login to the application", priority = 1)
	@Description("Test Description : Login Test with valid credentials")
    public void gotoHomePage() {
   
	    LoginPage objLoginPage = new LoginPage(driver);
    	objLoginPage.login("Admin", "admin123");
    	 
    	HomePage objHomePage = new HomePage(driver);
    	
    	// Verify Home Page
    	 Assert.assertEquals(objHomePage.getHomePageText(),"Dashboard");
    
    }
    
	@Severity(SeverityLevel.NORMAL)
    @Test(description = "This test will fail", priority = 2)
	@Description("Test Description : Login Test with missing username")
    public void missingUsername() {
   
	    LoginPage objLoginPage = new LoginPage(driver);
    	objLoginPage.login("", "admin123");
    	  	
    	// Verify Error Message
    	 Assert.assertEquals(objLoginPage.getMissingUsernameText(),"Invalid credentials");
    
    }
	
	@Severity(SeverityLevel.NORMAL)
    @Test(description = "This test will skip", priority = 3, enabled = false)
	@Description("Test Description : Login Test with missing password")
    public void missingPassword() {
   
	    LoginPage objLoginPage = new LoginPage(driver);
    	objLoginPage.login("admin", "");
    	   	
    	// Verify Error Message
   	     Assert.assertEquals(objLoginPage.getErrorMessage(),"Invalid credentials");
    
    }
    
   
}


