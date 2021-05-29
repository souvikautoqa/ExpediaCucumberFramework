package pages;

import core.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    By hotelTab = By.xpath("//ul[@id='uitk-tabs-button-container']/li[1]");
    By signInButton = By.xpath("//button[text()='Sign in']");
    By hotelSearchBtn = By.xpath(".//button[text()='Search']");
    By goingTo = By.xpath("//button[@aria-label='Going to']");

    By hotelDestination = By.xpath(".//input[@id='location-field-destination']");
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
        return driver.findElement(signInButton).isDisplayed();
    }

    public void navigateToHotelTAB(){
        driver.findElement(hotelTab).click();
    }

    public void addHotelBookingInformation(String destination){
        driver.findElement(goingTo).click();
        driver.findElement(hotelDestination).sendKeys(destination, Keys.ENTER);
//        driver.findElement(hotelCheckInDate).sendKeys("03/15/2020");
//        driver.findElement(hotelCheckIOutDate).sendKeys("03/20/2020");
        driver.findElement(hotelSearchBtn).click();
    }



}
