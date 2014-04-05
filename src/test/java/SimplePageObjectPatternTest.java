import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.CompanyPage;
import pages.IndexPage;
import pages.SpecialistPage;

/**
 * User: Mateusz Koncikowski
 * Date: 05/04/14
 * Time: 12:13
 */

public class SimplePageObjectPatternTest {

    private BrowserDriver browserDriver;
    private IndexPage indexPage;

    @Test
    public void simplePageObjectTest() {
        SpecialistPage specialistPage = indexPage.getTopMenu().openSpecialistPage();
        CompanyPage companyPage = specialistPage.getTopMenu().openCompanyPage();
        companyPage.getTopMenu().openSpecialistPage();
    }

    @Before
    public void startBrowser() {
        browserDriver = new BrowserDriver();
        browserDriver.startBrowser();
        indexPage = browserDriver.openIndex();
    }

    @After
    public void closeBrowser() {
        browserDriver.closeBrowser();
    }

}
