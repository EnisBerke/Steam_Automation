package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.*;
import utilities.Driver;

import java.time.Duration;

public class StepDefinitions {

    private WebDriver driver;

    private MainPage mainPage;

    private ProductPage productPage;

    private ScrollDown scrollDown;

    private ScrollUp scrollUp;

    private ShoppingCardPage shoppingCardPage;

    protected String firstApp;

    @Given("setting driver")
    public void setting_driver() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        mainPage = new MainPage(driver);
        productPage = new ProductPage(driver);
        scrollDown = new ScrollDown(driver);
        scrollUp = new ScrollUp(driver);
        shoppingCardPage = new ShoppingCardPage(driver);
    }

    @Given("go to main page")
    public void go_to_main_page() {
        driver.get("https://store.steampowered.com/");

    }
    @Given("scroll down")
    public void scroll_down() {
        scrollDown.scrollDown();

    }
    @Given("select product")
    public void select_product() throws InterruptedException {
        String productName = mainPage.getProductName();
        mainPage.clickProduct();
        Assert.assertEquals(productName, productPage.getProductTitle());

    }

    @Given("add product to card")
    public void add_product_to_card() {
        productPage.clickAddToCardButton();
    }

    @When("click continue shopping button")
    public void click_continue_shopping_button() {
        productPage.clickContinueShoppingButton();
    }
    @Then("confirm to product added into basket and displayed")
    public void confirm_to_product_added_into_basket_and_displayed() {
        productPage.displayBasketCount();
    }

    @Given("click basket icon")
    public void clickBasketIcon() {
        productPage.clickBasketIcon();
    }

    @When("click remove button")
    public void clickRemoveButton() {
        shoppingCardPage.clickRemoveButton();
    }

    @Then("confirm to cart is empty")
    public void confirmToCartIsEmpty() {
        shoppingCardPage.getCardEmptyIndicator();
    }

    @Given("scroll up")
    public void scrollUp() {
        scrollUp.getScrollUp();
    }

    @Given("get Featured And Recommended product name")
    public void getFeaturedAndRecommendedProductName() throws InterruptedException {
        String firstApp = mainPage.getFeaturedAppName();

    }

    @And("scroll right")
    public void scrollRight() throws InterruptedException {
        mainPage.clickFutureAndRecommendedRightArrow();
    }

    @Then("confirm name different between pages to page scroll right")
    public void confirmNameDifferentBetweenPagesToPageScrollRight() throws InterruptedException {
        Assert.assertNotEquals(firstApp, mainPage.getFeaturedAppName());
    }
}
