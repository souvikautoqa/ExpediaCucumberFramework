package pages;

import core.DriverFactory;
import core.TestConfig;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;
    private DriverFactory driverFactory;

    public BasePage() throws Exception {
        String env = System.getenv("env").toLowerCase();
        TestConfig.load(env);
        TestConfig.addProperty("browser",System.getenv("browser"));
        TestConfig.addProperty("env",env);
        driverFactory = new DriverFactory();
    }

    public WebDriver getDriver(){
        if(driver==null){
            this.driver = driverFactory.getDriver(TestConfig.getProperty("browser"));
        }
        return driver;
    }

    public void launchApp(){
      driver.get(TestConfig.getProperty("appBaseURL"));
    }



}
