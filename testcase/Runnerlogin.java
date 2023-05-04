package testcase;

import org.testng.annotations.DataProvider;

import baseclass.Baseclass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features/Logindata.feature",
glue="pages",
monochrome=true,
publish=true)

public class Runnerlogin extends Baseclass {
      
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
	return super.scenarios();
}
}
