package org.example.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTests {
	
	public WebDriver driver;
	public final static int TIMEOUT = 30;
    
 
	@BeforeMethod
    @Step("Start the application")
    public void setup() {
    	WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));

    }
 
    @Step("Stop the application")
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    
}
