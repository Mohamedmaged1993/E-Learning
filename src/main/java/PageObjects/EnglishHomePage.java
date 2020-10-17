package PageObjects;

import Utilities.ObjectRepo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utilities.ObjectRepo.searchField;

public class EnglishHomePage {
    WebDriver driver;
    WebDriverWait wait;

    //create constructor
    public EnglishHomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }

    //access to SelectSearchIcon
    public void selectSearchIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.SearchIconSelection));
        WebElement selectSearchBTN = driver.findElement(ObjectRepo.SearchIconSelection);
        selectSearchBTN.click();
    }

    // access to fill search field
    public void fillSearchData(String name) {
        driver.findElement(searchField).sendKeys(name);

    }

    // click on enter keyboard
    public void selectSearchField() {
        driver.findElement(searchField).sendKeys(Keys.ENTER);
    }
}
