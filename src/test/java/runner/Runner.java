package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Test
@CucumberOptions(features = "./src/test/java/featurefiles/LoginFeature3.feature",glue = {"stepdefinition"},dryRun = false) //=>AND
public class Runner extends AbstractTestNGCucumberTests {

}
