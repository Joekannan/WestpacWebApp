package com.westpac.webapp.pages;

import static org.junit.Assert.assertTrue;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResults;
import com.applitools.eyes.selenium.*;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class Applitools extends BasePage {

	// Initialize the eyes SDK and set your private API key.
    public static Eyes eyes = new Eyes();
        
    EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
	 String apikey = variables.getProperty("applitools.apikey");
	 
//########################################################################################################################################################################	
	public void openEyes(String testname){
		try {
			RectangleSize viewportSize = new RectangleSize(/*width*/ 1000, /*height*/ 800 ); 
			eyes.setApiKey(apikey);
			eyes.setForceFullPageScreenshot(true);	        
	        eyes.open(driver, "Westpac", testname);
	        eyes.setExplicitViewportSize(viewportSize); 
	        System.out.println(testname);
		}catch(Exception e) {
			e.printStackTrace();
		}
    }
//########################################################################################################################################################################
	public void eyesCheck(String testname){
        eyes.checkWindow(testname);
    }
//########################################################################################################################################################################
	public void eyesClose(){
        try {
            TestResults results = Applitools.eyes.close(false);
            assertTrue(results.isPassed());
        } finally {
            Applitools.eyes.abortIfNotClosed();
        }
    }
	//########################################################################################################################################################################
		public void closeEyes(){
	        try {
	            Applitools.eyes.close(false);
	        } finally {
	            Applitools.eyes.abortIfNotClosed();
	        }
	    }
}
