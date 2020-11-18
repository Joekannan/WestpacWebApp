package com.westpac.webapp.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import net.thucydides.core.webdriver.WebDriverFacade;

public class BasePage extends PageObject {
	
	public static String Value;
	public WebDriver driver= ((WebDriverFacade)ThucydidesWebDriverSupport.getDriver()).getProxiedDriver();

//########################################################################################################################################################################	  
  public boolean isElementPresent(WebElement we) {

	     if(we!=null) {
	    	 return true; 
	    }
	     else {
	         System.out.println("The target is null");
         return false;
     }
 } 
	  
//########################################################################################################################################################################	  
  public boolean isElementVisible(WebElement we) {

		     if(we.isDisplayed()) {
		    	 return true; 
		    }
		     else {
		         System.out.println("The target is null");
         return false;
     }
 } 

//########################################################################################################################################################################		 
public void scrollToElementByJS(AppiumDriver<WebElement> driver,WebElement element) {			
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
}
//########################################################################################################################################################################	

public static String readConfigfile (String Key) throws IOException {
	
	try {
		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream("./src/test/resources/config.properties");
		prop.load(ip);
		Value = prop.getProperty(Key);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	return Value;
}
}
