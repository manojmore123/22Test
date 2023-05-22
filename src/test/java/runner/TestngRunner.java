package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Automation\\SelfProject\\Automation\\src\\test\\java\\feature",
glue={"stepDefinations"})
public class TestngRunner extends AbstractTestNGCucumberTests {
	
	

}
