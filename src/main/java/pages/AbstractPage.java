package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public void typeInto(WebElement we, String value) {
        we.clear();
        we.sendKeys(value);
    }

    public void clickElement(WebElement we) {
        we.click();
    }

    public String getPageSource() {
        return driver.getPageSource();
    }



    public WebDriver getDriver() {
        return driver;
    }
}
