package pages;

import components.TopMenu;
import org.openqa.selenium.WebDriver;

/**
 * User: Mateusz Koncikowski
 * Date: 05/04/14
 * Time: 12:38
 */

public class CompanyPage extends AbstractPage{

    TopMenu topMenu;

    public CompanyPage(WebDriver driver) {
        super(driver);
        topMenu = new TopMenu(getDriver());
    }

    public TopMenu getTopMenu() {
        return topMenu;
    }
}
