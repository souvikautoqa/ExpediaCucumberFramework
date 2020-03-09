package pages;

import core.TestConfig;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    By hotelTab = By.xpath(".//button[@id='tab-hotel-tab-hp']");
    By bundleSearchBtn = By.xpath("(.//span[text()='Search']/..)[3]");
    By hotelSearchBtn = By.xpath("(.//span[text()='Search']/..)[2]");
    By hotelDestination = By.xpath(".//input[@id='hotel-destination-hp-hotel']");
    By hotelCheckInDate = By.xpath(".//input[@id='hotel-checkin-hp-hotel']");
    By hotelCheckIOutDate = By.xpath(".//input[@id='hotel-checkout-hp-hotel']");

    private WebDriver driver;

    public HomePage(WebDriver driver) throws Exception {
        this.driver = driver;
    }

    public void launchApp(){
        driver.get(TestConfig.getProperty("appBaseURL"));
    }

    public boolean ifNavigatedToExpedia(){
        return driver.findElement(bundleSearchBtn).isDisplayed();
    }

    public void navigateToHotelTAB(){
        driver.findElement(hotelTab).click();
    }

    public void addHotelBookingInformation(){
        driver.findElement(hotelDestination).sendKeys("Galway, Galway (county), Ireland");
        driver.findElement(hotelCheckInDate).sendKeys("03/15/2020");
        driver.findElement(hotelCheckIOutDate).sendKeys("03/20/2020");
        driver.findElement(hotelSearchBtn).click();
    }



}
