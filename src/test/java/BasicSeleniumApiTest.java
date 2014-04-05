import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * User: Mateusz Koncikowski
 * Date: 05/04/14
 * Time: 10:56
 */

public class BasicSeleniumApiTest {

    private WebDriver driver;

    @Test
    public void simpleSeleniumTest() {
        driver.get("http://www.itkontrakt.pl/specjalista/formularz-zgloszeniowy/?lang=en");
        driver.findElement(By.name("your-name")).sendKeys("Mateusz Koncikowski");
        driver.findElement(By.name("text-adr")).sendKeys("Wrocław, SkyTower");
        driver.findElement(By.name("date-birth")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ui-datepicker-div"))));
        Select selectMonth = new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
        selectMonth.selectByVisibleText("Nov");
        driver.findElement(By.xpath("//td[@data-handler='selectDay']//a[text() = '15']")).click();
        driver.findElement(By.name("your-city")).sendKeys("Wrocław");
        driver.findElement(By.name("your-zip")).sendKeys("50-000");
        driver.findElement(By.name("cv-upload")).sendKeys("/Users/mateusz/Workspace/it-kontrakt-szkolenie/pom.xml");
        driver.findElement(By.name("acceptance-199")).click();
        System.out.println(driver.getTitle());
    }

    @Before
    public void startBrowser() {
        driver = new FirefoxDriver();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
