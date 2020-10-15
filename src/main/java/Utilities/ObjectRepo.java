package Utilities;

import org.openqa.selenium.By;

public class ObjectRepo {

    public static By EnglishBTNSelection = By.xpath("//a[contains(@href,'en')]");
    public static By SearchIconSelection = By.xpath("// button[contains(@type,'button')]");
    public static By searchField = By.xpath("// input[contains(@id,'txt_search_query')]");
    public static By SelectSearchField = By.xpath("// button[contains(@id,'btn_global_search')]");
    public static By SelectSecondLink = By.xpath("//a[contains(@href,'nagwa.com/en/lessons')]");
    public static By PreviewClickBtn = By.xpath("//a[contains(@class,'btn btn-orange btn-outline')]");
    public static By CountQuestionsNo = By.xpath("//div[contains(@class,'one-part-question')]");
}
