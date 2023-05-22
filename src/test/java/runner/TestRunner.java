package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = "feature",
//		glue= "stepDefinations" , stepNotifications= true)
//


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Automation\\SelfProject\\Automation\\src\\test\\java\\feature"
    ,glue={"stepDefinations"}, stepNotifications=true, tags= "@SmokeTest or @Regression")
public class TestRunner {

}
