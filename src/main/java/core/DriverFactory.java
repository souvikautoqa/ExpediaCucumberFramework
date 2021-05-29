package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
private WebDriver driver = null;
	
	public WebDriver getDriver(String browser) {	
		switch(browser.toLowerCase()) {
			case "chrome"  :
				System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "firefox" :
				driver = new FirefoxDriver();
			default : 
				System.out.println("Incorrect browser name provided "+ browser);
				System.out.println("Hence running in Chrome ");
				driver = new ChromeDriver();
				break;
		}
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(TestConfig.getProperty("pageLoadTimeout")), TimeUnit.SECONDS);  // One time config done for the whole project
		driver.manage().timeouts().implicitlyWait(Long.parseLong(TestConfig.getProperty("implicitWait")), TimeUnit.SECONDS); // One time config
		driver.manage().window().maximize();
		return driver;
	}
	
	public void quitDriver() {
		if(driver!=null) {
			driver.quit();
		}
	}
}
