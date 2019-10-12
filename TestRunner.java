package or.ho;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\mi.feature", glue="or.ho", monochrome=true)
public class TestRunner {
	

}
