package be.refleqt.testing.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import static be.refleqt.testing.support.DriverManager.getWebDriver;
import static be.refleqt.testing.support.DriverManager.quitWebDriver;

public class CommonSteps {

    private WebDriver driver;

    @Before
    public void beforeScenario() {
        driver = getWebDriver();
    }

    @After
    public void afterScenario() {
        quitWebDriver();
    }
}
