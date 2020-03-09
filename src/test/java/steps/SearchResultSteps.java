package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SearchResultPage;

public class SearchResultSteps extends BaseStep{

    public SearchResultSteps() throws Exception {
    }

    @Then("^I should be able to view list of Hotel Search result$")
    public void navigateToExpedia() throws Exception {
        Assert.assertEquals(true,getSearchResultPage().verifyIfSearchResultDisplayed());
    }

}
