package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions",
                    plugin = {"pretty", "json:target/cucumber.json", "html:target/site/cucumber-pretty"},
                    strict = false
                )
public class TestRunner {
}
