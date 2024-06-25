package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCardPage {

    private final WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div[6]/div[3]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div/div/div[2]/div[4]/div[2]/div[2]")
    private WebElement removeButton;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div[6]/div[3]/div[2]/div/div[2]/div[3]/div[1]/div[1]")
    private  WebElement cardEmptyIndicator;

    public ShoppingCardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickRemoveButton() {
        removeButton.click();
    }

    public void getCardEmptyIndicator() {
        Assert.assertTrue(cardEmptyIndicator.isDisplayed());
    }
}
