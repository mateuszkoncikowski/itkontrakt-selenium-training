package pages;

import components.TopMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * User: Mateusz Koncikowski
 * Date: 05/04/14
 * Time: 12:22
 */

public class IndexPage extends AbstractPage{

    TopMenu topMenu;

    public IndexPage(WebDriver driver) {
        super(driver);
        topMenu = PageFactory.initElements(driver, TopMenu.class);
    }

    public TopMenu getTopMenu() {
        return topMenu;
    }
}
