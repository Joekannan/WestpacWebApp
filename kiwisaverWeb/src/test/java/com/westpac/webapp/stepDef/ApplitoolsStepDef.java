package com.westpac.webapp.stepDef;

import com.westpac.webapp.steps.ApplitoolSteps;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ApplitoolsStepDef{
	
	public Scenario scenario;
	public String scenarioName;
	
	@Steps
	ApplitoolSteps applitoolSteps;
	
	@Before
	public void before(Scenario scenario) {
	    this.scenario = scenario;
	    scenarioName =  scenario.getName();
	    
	}
	
	@Given("^I setup Applitools$")
	public void i_set_up_Applitools() throws Exception {
		applitoolSteps.setupEye(scenarioName);
	}

	@When("^I Capture the screen$")
	public void i_Capture_the_screen() throws Exception {
		applitoolSteps.checkEye(scenarioName);
	}

	@Then("^I tear down Applitools$")
	public void i_tear_down_Applitools() throws Exception {
		applitoolSteps.tearDownEye();
	}
	
	
}
