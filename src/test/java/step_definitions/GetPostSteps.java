package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GetPostSteps {

    @Given("^Perform GET operation for \"([^\"]*)\"$")
    public void perform_GET_operation_for(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Amr1");
    }

    @Given("^Perform GET for the post number \"([^\"]*)\"$")
    public void perform_GET_for_the_post_number(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Amr2");
    }

    @Then("^Should see the authorName as \"([^\"]*)\"$")
    public void should_see_the_authorName_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Amr3");
    }
}
