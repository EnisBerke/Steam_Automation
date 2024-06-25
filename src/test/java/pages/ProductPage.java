package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    private final WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div[6]/div[3]/div[3]/div[1]/div[5]/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/a")
    private WebElement addToCardButton;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div[3]/div/div[3]/button[1]")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div[6]/div[3]/div[2]/div/div/div[1]/div/div/div")
    private WebElement basketIcon;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div[6]/div[3]/div[3]/div[1]/div[2]/div[2]/div/div[3]")
    public WebElement productTitle;


    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCardButton() {
        addToCardButton.click();
    }

    public void clickContinueShoppingButton() {
        continueShoppingButton.click();
    }

    public void displayBasketCount() {
        Assert.assertTrue(basketIcon.isDisplayed());
    }

    public void clickBasketIcon() {
        basketIcon.click();
    }

    public String getProductTitle() {
        return productTitle.getText();

    }
}
