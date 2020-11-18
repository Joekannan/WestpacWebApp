package com.westpac.webapp.pages;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;


public class HomePage extends BasePage {

	@FindBy(id="ubermenu-section-link-kiwisaver-ps")
    public WebElement lnkKiwiSaver;
	
	@FindBy(id="ubermenu-item-cta-kiwisaver-calculators-ps")
    public WebElement lnkKiwiSaverCalc;
	
	Actions action = new Actions(driver);
	
//###################################################################################################################################
//Function Name:		launchApplication 
//Input Parameter:		None
//Output Parameter:		None 
//Description:			This function is used to launch the application using the base url configured in serenity property file
//Tester:				Nagajothi Kaliappan
//###################################################################################################################################
	public void launchApplication() {
		try {
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			open();
			String title= getDriver().getTitle().trim();
			assertEquals("Bank | Westpac New Zealand - Helping Kiwis with their personal banking", title);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//###################################################################################################################################
//Function Name:		clickKiwiSaver 
//Input Parameter:		None
//Output Parameter:		None 
//Description:			This function is used to click Kiwi Saver link from Home page tabs
//Tester:				Nagajothi Kaliappan
//###################################################################################################################################
	public void clickKiwiSaver() {
		try {
			if(isElementPresent(lnkKiwiSaver)) {	
				clickOn(lnkKiwiSaver);
				waitFor(ExpectedConditions.elementToBeClickable(lnkKiwiSaverCalc));	
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			action.moveToElement(lnkKiwiSaver).build().perform();
			waitFor(ExpectedConditions.elementToBeClickable(lnkKiwiSaverCalc));
		}
	}
	
//###################################################################################################################################
//Function Name:		clickKiwiSaverCalc 
//Input Parameter:		None
//Output Parameter:		None 
//Description:			This function is used to click Kiwi Saver calculator once kiwisaver is clicked from Home page tabs
//Tester:				Nagajothi Kaliappan
//###################################################################################################################################
	public void clickKiwiSaverCalc() {
		try {
			System.out.println(isElementVisible(lnkKiwiSaverCalc));
			if(isElementVisible(lnkKiwiSaverCalc)) {
				action.moveToElement(lnkKiwiSaverCalc).build().perform();
				clickOn(lnkKiwiSaverCalc);
				waitForTitleToAppear("KiwiSaver calculator - Westpac NZ");
				String title= getDriver().getTitle().trim();
				assertEquals("KiwiSaver calculator - Westpac NZ", title);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
