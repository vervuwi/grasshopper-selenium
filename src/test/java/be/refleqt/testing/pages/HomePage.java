package be.refleqt.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static be.refleqt.testing.support.DriverManager.getWebDriver;

public class HomePage {

    @FindBy(css = "a[title='Women']")
    WebElement womenCategoryButton;

    @FindBy(id = "search_query_top")
    WebElement searchBar;

    @FindBy(name = "submit_search")
    WebElement searchSubmit;

    private WebDriver driver;
    WebDriverWait wait;

    public HomePage() {
        this.driver = getWebDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(45));
    }

    public CategoryPage navigateToCategoryPage() {
        wait.until(ExpectedConditions.visibilityOf(womenCategoryButton));
        womenCategoryButton.click();

        return new CategoryPage();
    }


    public void searchFor(String searchTerm){
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(searchTerm);

        searchSubmit.click();
    }

}
