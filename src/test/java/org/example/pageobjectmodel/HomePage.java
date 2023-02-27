package org.example.pageobjectmodel;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	  @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	  public  WebElement homePageUserName;

	    @Step("Get heading of HomePage")
	    public String getHomePageText() {
	       return homePageUserName.getText();
   }

}
