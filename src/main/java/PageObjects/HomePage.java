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
    //access to SelectSearchIcon

    public void selectSearchIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.SearchIconSelection));
        WebElement selectSearchBTN = driver.findElement(ObjectRepo.SearchIconSelection);
        selectSearchBTN.click();
    }

    public void fillSearchData(String name) {
        driver.findElement(searchField).sendKeys(name);

    }
    public void selectSearchField() {
        driver.findElement(searchField).sendKeys(Keys.ENTER);

    }
    public void selectSecondOption() {

        List<WebElement> li = driver.findElements(ObjectRepo.SelectSecondLink);;
        li.get(1).click();
    }

    public void previewClickBTN() {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.PreviewClickBtn));
        WebElement clickPreviewhBTN = driver.findElement(ObjectRepo.PreviewClickBtn);
        clickPreviewhBTN.click();
    }
    public void countsQuestions() {
        List<WebElement> totalLinks = driver.findElements(ObjectRepo.CountQuestionsNo);
        int totalQuestions = totalLinks.size();
        System.out.println("Total NO.OF QUESTIONS : " + totalQuestions);
    }
}
