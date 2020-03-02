package steps;

import io.cucumber.java.en.Then;

public class SearchResultSteps {

    @Then("^I should be able to view list of Hotel Search result$")
    public void navigateToExpedia(){
        System.out.println("I should be able to view Search Results");
    }

}
