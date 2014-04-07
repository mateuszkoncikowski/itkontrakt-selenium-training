package components;

import enums.Localization;
import enums.Position;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.AbstractPage;
import pages.SearchResultPage;

import java.util.List;

/**
 * User: Mateusz Koncikowski
 * Date: 05/04/14
 * Time: 15:45
 */

public class SearchJobForm extends AbstractPage {

    @FindBy(name = "keywords")
    private WebElement keywordsField;
    
    @FindBy(id = "s2id_autogen1")
    private WebElement localizationField;

    @FindBy(id = "s2id_autogen2")
    private WebElement positionField;

    @FindBy(xpath = "//input[@value='search']")
    private WebElement searchButton;

    public SearchJobForm(WebDriver driver) {
        super(driver);
    }

    public SearchJobForm setKeywords(String keywords) {
        typeInto(keywordsField, keywords);
        return this;
    }

    public SearchJobForm setLocalizations(List<Localization> localizations) {
        for (Localization localization : localizations) {
            typeInto(localizationField, localization.toString() + Keys.RETURN);
        }
        return this;
    }

    public SearchJobForm setPositions(List<Position> positions) {
        for (Position position : positions) {
            typeInto(positionField, position.toString() + Keys.RETURN);
        }
        return this;
    }

    public SearchResultPage search() {
        clickElement(searchButton);
        return PageFactory.initElements(getDriver(), SearchResultPage.class);
    }
}
