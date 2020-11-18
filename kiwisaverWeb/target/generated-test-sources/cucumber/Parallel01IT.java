import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
strict = true,
features = {"C:/WestPac/kiwisaverWeb/src/test/resources/features/KiwiSaver/ApplitoolsTest.feature"},
plugin = {"json:C:/WestPac/kiwisaverWeb/target/cucumber-parallel/1.json"},
monochrome = false,
tags = {},
glue = {"com.westpac.webapp.stepDef"})
public class Parallel01IT {
}