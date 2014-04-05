package pages;

import components.TopMenu;
import org.openqa.selenium.WebDriver;

/**
 * User: Mateusz Koncikowski
 * Date: 05/04/14
 * Time: 12:28
 */

public class SpecialistPage extends AbstractPage {

    private final TopMenu topMenu;

    public SpecialistPage(WebDriver driver) {
        super(driver);
        topMenu = new TopMenu(getDriver());
    }

    public TopMenu getTopMenu() {
        return topMenu;
    }
}
