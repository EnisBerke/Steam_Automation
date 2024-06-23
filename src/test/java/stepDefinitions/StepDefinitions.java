package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.ProductPage;
import pages.ScrollDown;
import utilities.Driver;

import java.time.Duration;

public class StepDefinitions {

    private WebDriver driver;

    private MainPage mainPage;

    private ProductPage productPage;

    private ScrollDown scrollDown;

    @Given("go to main page")
    public void go_to_main_page() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://store.steampowered.com/");

    }
    @Given("scroll down")
    public void scroll_down() {
        scrollDown = new ScrollDown(driver);
        scrollDown.scrollDown();

    }
    @Given("select product")
    public void select_product() {
        mainPage = new MainPage(driver);
        mainPage.clickProduct();
    }
    @Given("scroll down again")
    public void scroll_down_again() throws InterruptedException {
        scrollDown = new ScrollDown(driver);
        scrollDown.scrollDown();
        Thread.sleep(3000);
    }

    @Given("add product to card")
    public void add_product_to_card() {
        productPage = new ProductPage(driver);
        productPage.clickAddToCardButton();
    }

    @When("click continue shopping button")
    public void click_continue_shopping_button() {
        productPage = new ProductPage(driver);
        productPage.clickContinueShoppingButton();
    }
    @Then("confirm to product added into basket and displayed")
    public void confirm_to_product_added_into_basket_and_displayed() {
        productPage = new ProductPage(driver);
        productPage.displayBasketCount();
    }

}
