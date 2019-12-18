package webshops;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features="MyFeatures", glue="C:\\Users\\PDC3B-Training.PDC3B\\eclipse\\siddhii-workspace\\CucumberProject\\src\\test\\java\\StepDefinitions\\shopp.java", tags={"@Regression, @sanity"})

public class demowebshops {

}
