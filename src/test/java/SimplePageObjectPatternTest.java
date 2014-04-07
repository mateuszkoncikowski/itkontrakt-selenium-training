import enums.Localization;
import enums.Position;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.IndexPage;
import pages.SearchResultPage;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * User: Mateusz Koncikowski
 * Date: 05/04/14
 * Time: 12:13
 */

public class SimplePageObjectPatternTest {

    private BrowserDriver browserDriver;
    private IndexPage indexPage;

    @Test
    public void test_1() {
        List<Localization> localizations = asList(Localization.WROCLAW, Localization.WARSZAWA);
        List<Position> positions = asList(Position.DEVELOPER, Position.TESTER);


        SearchResultPage searchResultPage = indexPage
                .getTopMenu().openSpecialistPage()
                .getSearchJobForm()
                .setKeywords("tester")
                .setLocalizations(localizations)
                .setPositions(positions)
                .search();

        String expectedString = "Brak ofert spełniających podane kryteria wyszukiwania";
        assertThat(searchResultPage.getPageSource(), containsString(expectedString));
    }

    @Test
    public void test_2() {
        List<Localization> localizations = asList(Localization.WROCLAW, Localization.WARSZAWA);
        List<Position> positions = asList(Position.TESTER);

        SearchResultPage searchResultPage = indexPage
                .getSearchJobForm()
                .setKeywords("tester")
                .setLocalizations(localizations)
                .setPositions(positions)
                .search();

        String expectedString = "Brak ofert spełniających podane kryteria wyszukiwania";
        assertThat(searchResultPage.getPageSource(), containsString(expectedString));
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
