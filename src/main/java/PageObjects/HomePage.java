package PageObjects;

import Utilities.ObjectRepo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import static Utilities.ObjectRepo.searchField;



public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

//create constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }

    //access to SelectEnglishLanguage

    public void selectEnglishLang() {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.EnglishBTNSelection));
        WebElement selectEngBTN = driver.findElement(ObjectRepo.EnglishBTNSelection);
        selectEngBTN.click();
    }
}
