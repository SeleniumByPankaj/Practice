package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions
(
		features = "src/test/java/features",
		glue = {"stepDefinations", "commons"},
		tags = "@redBusSearch",
		monochrome = true,
		plugin = {"pretty" , "html:target/cucumber-reports"}
		)

public class SuiteRunner {

	
}
