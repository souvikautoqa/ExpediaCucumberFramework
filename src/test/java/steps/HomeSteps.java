package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;

public class HomeSteps {
    HomePage home = null;

    public HomeSteps() throws Exception {
        home = new HomePage();
    }

    @Given("^I am navigated to Expedia$")
    public void navigateToExpedia(){
        Assert.assertEquals(true,home.ifNavigatedToExpedia());
    }

    @When("I choose Hotel Booking Tab")
    public void iChooseHotelBookingTab() {
        home.navigateToHotelTAB();
    }

    @And("I provide Hotel Booking Information")
    public void iProvideHotelBookingInformation() {
       home.addHotelBookingInformation();
    }
}
