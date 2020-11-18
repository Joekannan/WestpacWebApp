package com.westpac.webapp.steps;

import org.aspectj.weaver.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.westpac.webapp.pages.Applitools;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.steps.StepEventBus;

public class ApplitoolSteps extends ScenarioSteps{

	Applitools applitools;
	
	Logger logger = LoggerFactory.getLogger(Utils.class);
	
	@Step
	public void setupEye(String scenarioName) {
		applitools.openEyes(scenarioName);
	}
	
	@Step
	public void checkEye(String scenarioName) {
		applitools.eyesCheck(scenarioName);
	}
	
	@Step
	public void tearDownEye() {
		applitools.eyesClose();
	}

//########################################################################################################################################################################	
	public String stepName(){
		String currentStepDescr = StepEventBus.getEventBus().getCurrentStep().get().toString();
		return currentStepDescr;
	}
//########################################################################################################################################################################
}
