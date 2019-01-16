package easy;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue= {"easy"},tags= {"@check"},plugin= {"html:target"},dryRun=false,monochrome=true)

public class TestRunner {

}
