package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollUp {

    private final WebDriver driver;

    private JavascriptExecutor js;

    public ScrollUp(WebDriver driver) {
        this.driver = driver;
    }

    public void getScrollUp() {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1500)");
    }
}
