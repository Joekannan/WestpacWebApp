package com.westpac.webapp.testRunner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/KiwiSaver/ApplitoolsTest.feature", glue="com.westpac.webapp.stepDef")
public class TestRunner {

}
