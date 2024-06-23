package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollDown {
    private final WebDriver driver;

    private JavascriptExecutor js;

    public ScrollDown(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollDown() {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }
}
