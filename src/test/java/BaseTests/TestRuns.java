package BaseTests;

import PageObjects.HomePage;
import Utilities.ObjectRepo;
import Utilities.PropertiesConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRuns {


    WebDriver driver;
    WebDriverWait wait;
    HomePage homePage;
    PropertiesConfig propertiesConfig;
    int timeOut = 10;

    @BeforeClass
    public void beforeclass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, timeOut);
        homePage = new HomePage(driver);
        propertiesConfig = new PropertiesConfig();
        driver.get(propertiesConfig.getProperty("navigateUrl"));
    }

    @Test(priority = 1)
    public void successfulTest() {
        homePage.selectEnglishLang();
        homePage.selectSearchIcon();
    }

}
