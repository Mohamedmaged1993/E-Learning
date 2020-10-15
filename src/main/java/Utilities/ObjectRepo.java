package Utilities;

import org.openqa.selenium.By;

public class ObjectRepo {

    public static By EnglishBTNSelection = By.xpath("//a[contains(@href,'en')]");
    public static By SearchIconSelection = By.xpath("// button[contains(@type,'button')]");
    public static By searchField = By.xpath("// input[contains(@id,'txt_search_query')]");
    public static By SelectSearchField = By.xpath("// button[contains(@id,'btn_global_search')]");


}
