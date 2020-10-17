package PageObjects;

import Utilities.ObjectRepo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultsURL {
    WebDriver driver;
    WebDriverWait wait;

    //create constructor
    public SearchResultsURL(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }

    //create method to select second option
    public void selectSecondOption(int i) {
        List<WebElement> li = driver.findElements(ObjectRepo.SelectSecondLink);
        li.get(i).click();
    }

    //access to click PreviewBTN
    public void previewClickBTN() {
        wait.until(ExpectedConditions.elementToBeClickable(ObjectRepo.PreviewClickBtn));
        WebElement clickPreviewhBTN = driver.findElement(ObjectRepo.PreviewClickBtn);
        clickPreviewhBTN.click();
    }

    //create method to count no of questions displayed on screen
    public void countsQuestions() {
        List<WebElement> totalLinks = driver.findElements(ObjectRepo.CountQuestionsNo);
        int totalQuestions = totalLinks.size();
        System.out.println("Total NO.OF QUESTIONS : " + totalQuestions);
    }
}
