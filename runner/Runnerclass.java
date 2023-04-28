package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/login.feature",
                         glue="stepdefinition",
                         monochrome=true,
                         publish=true)

public class Runnerclass extends AbstractTestNGCucumberTests {

}
