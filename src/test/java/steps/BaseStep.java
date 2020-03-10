package steps;

import core.JSONDataProvider;
import core.TestConfig;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchResultPage;

import java.io.File;
import java.util.Map;

public class BaseStep {

    private static WebDriver driver = null;

    public BaseStep() throws Exception { }

    public Map<String,String> data(String dataSet) throws Exception {
        File testDataLocation = new File("src/main/resources/testdata");
        String env =  TestConfig.getProperty("env");
        JSONDataProvider dataProvider = new JSONDataProvider(testDataLocation+"/data."+env+".json");
        return dataProvider.getAllData(dataSet);
    }

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
