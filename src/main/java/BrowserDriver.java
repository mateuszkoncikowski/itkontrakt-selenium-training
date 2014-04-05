import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.IndexPage;

/**
 * User: Mateusz Koncikowski
 * Date: 05/04/14
 * Time: 12:14
 */

public class BrowserDriver {

    private FirefoxDriver driver;

    public BrowserDriver() {}

    public void startBrowser() {
        driver = new FirefoxDriver();
    }

    public IndexPage openIndex() {
        driver.get("http://www.itkontrakt.pl/?lang=en");
        return PageFactory.initElements(driver, IndexPage.class);
    }

    public void closeBrowser() {
        driver.quit();
    }
}
