package pages;

import org.openqa.selenium.WebDriver;

/**
 * User: Mateusz Koncikowski
 * Date: 05/04/14
 * Time: 12:33
 */

public class AbstractPage {

    private final WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageSource() {
        return driver.getPageSource();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
