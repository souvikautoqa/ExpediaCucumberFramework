package steps;

import io.cucumber.java.en.Then;
import pages.SearchResultPage;

public class SearchResultSteps {

    SearchResultPage resultPage = null;

    public SearchResultSteps() throws Exception {
        resultPage = new SearchResultPage();
    }


    @Then("^I should be able to view list of Hotel Search result$")
    public void navigateToExpedia(){
        System.out.println("I should be able to view Search Results");
    }

}
