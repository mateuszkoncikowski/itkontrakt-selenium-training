package pages;

import components.TopMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * User: Mateusz Koncikowski
 * Date: 05/04/14
 * Time: 12:38
 */

public class CompanyPage extends AbstractPage{

    TopMenu topMenu;

    public CompanyPage(WebDriver driver) {
        super(driver);
        topMenu = PageFactory.initElements(getDriver(), TopMenu.class);
    }

    public TopMenu getTopMenu() {
        return topMenu;
    }
}
