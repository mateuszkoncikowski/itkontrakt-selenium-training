package pages;

import components.SearchJobForm;
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
    SearchJobForm searchJobForm;

    public IndexPage(WebDriver driver) {
        super(driver);
        topMenu = PageFactory.initElements(getDriver(), TopMenu.class);
        searchJobForm = PageFactory.initElements(getDriver(), SearchJobForm.class);
    }

    public TopMenu getTopMenu() {
        return topMenu;
    }

    public SearchJobForm getSearchJobForm() {
        return searchJobForm;
    }
}
