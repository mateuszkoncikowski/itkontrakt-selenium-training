package pages;

import components.SearchJobForm;
import components.TopMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * User: Mateusz Koncikowski
 * Date: 05/04/14
 * Time: 12:28
 */

public class SpecialistPage extends AbstractPage {

    private TopMenu topMenu;
    private SearchJobForm searchJob;

    public SpecialistPage(WebDriver driver) {
        super(driver);
        topMenu = PageFactory.initElements(getDriver(), TopMenu.class);
        searchJob = PageFactory.initElements(getDriver(), SearchJobForm.class);
    }

    public TopMenu getTopMenu() {
        return topMenu;
    }

    public SearchJobForm getSearchJobForm() {
        return searchJob;
    }
}
