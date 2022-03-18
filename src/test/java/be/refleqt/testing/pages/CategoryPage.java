package be.refleqt.testing.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static be.refleqt.testing.support.DriverManager.getWebDriver;

public class CategoryPage {

    @FindBy(className = "cat-name")
    private WebElement categoryTitleLabel;

    private WebDriver driver;
    WebDriverWait wait;

    public CategoryPage() {
        this.driver = getWebDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(45));
    }

    public void validateCategoryPage() {
        wait.until(ExpectedConditions.visibilityOf(categoryTitleLabel));
        Assert.assertEquals(categoryTitleLabel.getText(), "WOMEN ");
    }
}
