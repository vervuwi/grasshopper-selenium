package be.refleqt.testing.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver = null;

    public static WebDriver getWebDriver() {
        if (driver == null) {
            prepareWebDriver();
        }
        return driver;
    }

    public static void quitWebDriver() {
        driver = getWebDriver();
        driver.quit();
        driver = null;
    }

    private static void prepareWebDriver() {
        driver = new ChromeDriver();
    }
}
