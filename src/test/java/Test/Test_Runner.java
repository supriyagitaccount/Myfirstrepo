package Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFile"},
glue= {"Steps"},
plugin= {"pretty","html:htmlReport"})
public class Test_Runner {

	
}
