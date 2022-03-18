package be.refleqt.testing.steps;

import be.refleqt.testing.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static be.refleqt.testing.support.DriverManager.getWebDriver;

public class HomePageSteps {

    public WebDriver driver;

    public HomePageSteps() {
        this.driver = getWebDriver();
    }

    @Given("I visit {string}")
    public void iVisit(String webSite) {
        driver.get(webSite);
    }

    @When("I navigate to the product list page")
    public void iNavigateToTheProductListPage() {
        new HomePage()
                .navigateToCategoryPage()
                .validateCategoryPage();
    }

    @When("I search for t-shirt")
    public void searchForTshirt(){
        new HomePage()
                .searchFor("t-shirt");
    }
}
