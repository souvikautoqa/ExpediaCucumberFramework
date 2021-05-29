package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SearchResultPage {

    By searchResult = By.xpath(".//ol[contains(@class,'results-list')]//li//h3[@aria-hidden='true']");

    private WebDriver driver = null;

    public SearchResultPage(WebDriver driver) throws Exception {
       this.driver = driver;
    }

    public boolean verifyIfSearchResultDisplayed() {
        List<WebElement> hotels = driver.findElements(searchResult);
        boolean status = (hotels.size() > 0) ? true : false;
        return status;
    }
}
