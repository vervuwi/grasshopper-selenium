package be.refleqt.testing.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"be.refleqt.testing"},
        plugin = {"html:target/cucumber-reports/cucumber.html"},
        tags = "@demo"
)
public class CucumberExecutor {
}
