package runnerz;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features="MyFeatures", glue="Stepdefinitions", tags={"@Regression"})

public class runnerzz {
	

}
