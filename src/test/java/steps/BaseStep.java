package steps;

import core.TestConfig;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchResultPage;

public class BaseStep {

    private static WebDriver driver = null;

    public BaseStep() throws Exception { }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void setDriver(WebDriver driver){
        BaseStep.driver = driver;
    }

    public HomePage getHomePage() throws Exception {
        return new HomePage(driver);
    }

    public SearchResultPage getSearchResultPage() throws Exception {
        return new SearchResultPage(driver);
    }


}
