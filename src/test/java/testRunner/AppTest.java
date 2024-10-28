package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



//@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"FeatureFiles"},
		monochrome = true,
		glue= {"stepDefinations"},
		dryRun = false,
		plugin = {"pretty","html:target/report/cucumber.html",
				"json:target/report/cucumber.json","junit:target/report/cucumber.xml"}
		
		)
public class AppTest extends AbstractTestNGCucumberTests   {	
	
}
