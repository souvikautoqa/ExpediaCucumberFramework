package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;

public class HomeSteps extends BaseStep{

    public HomeSteps() throws Exception {
    }
    @Given("^I am navigated to Expedia$")
    public void navigateToExpedia() throws Exception {
        getHomePage().launchApp();
        Assert.assertEquals(true,getHomePage().ifNavigatedToExpedia());
    }

    @When("^I choose Hotel Booking Tab$")
    public void iChooseHotelBookingTab() throws Exception {
        getHomePage().navigateToHotelTAB();
    }

    @And("^I provide (.*?) Hotel Booking Information$")
    public void iProvideHotelBookingInformation(String dataset) throws Exception {
        getHomePage().addHotelBookingInformation(data(dataset).get("city"));
    }

}
