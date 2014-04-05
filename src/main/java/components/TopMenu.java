package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.AbstractPage;
import pages.CompanyPage;
import pages.SpecialistPage;

/**
 * User: Mateusz Koncikowski
 * Date: 05/04/14
 * Time: 12:42
 */

public class TopMenu extends AbstractPage {

    @FindBy(xpath = "//ul[@id='menu-top-menu']//a[text() = 'Specialist']")
    private WebElement specialistButton;

    @FindBy(xpath = "//ul[@id='menu-top-menu']//a[text() = 'Company']")
    private WebElement companyButton;

    public TopMenu(WebDriver driver) {
        super(driver);
    }

    public SpecialistPage openSpecialistPage() {

        specialistButton.click();
        return PageFactory.initElements(getDriver(), SpecialistPage.class);
    }

    public CompanyPage openCompanyPage() {
        companyButton.click();
        return PageFactory.initElements(getDriver(), CompanyPage.class);
    }
}
