package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class MainPage {
    private final WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div[6]/div[3]/div[2]/div[7]/div/div/div[1]/div[1]/div[3]/a[2]")
    private WebElement product;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div[6]/div[3]/div[2]/div[7]/div/div/div[1]/div[1]/div[3]/a[2]/div[1]/img")
    private WebElement productImg;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div[6]/div[3]/div[2]/div[6]/div/div/div[4]")
    private WebElement featuredAndRecommendedRightArrow;

    @FindBy(className = "app_name")
    private WebElement featuredAppName;

    public MainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickProduct() {
        product.click();
    }

    public String getProductName() {
        return productImg.getAttribute("alt");
    }
    public void clickFutureAndRecommendedRightArrow() {
        featuredAndRecommendedRightArrow.click();
    }

    public String getFeaturedAppName() {
        return featuredAppName.getText();
    }

}
