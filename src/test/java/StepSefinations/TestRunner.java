package StepSefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources" ,glue= {"StepSefinations"})
public class TestRunner {

	//Selenium version that supports CDP version 133
    
}
