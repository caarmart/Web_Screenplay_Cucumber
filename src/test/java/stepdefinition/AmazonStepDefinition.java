package stepdefinition;

import assertion.AvailabilityAssertion;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interaction.GoFor;
import interaction.Select;
import question.ItemIsAvailable;
import task.Search;
import util.PrepareActor;

import static assertion.AvailabilityAssertion.ERROR_AVAILABILITY;
import static interaction.Common.openTheBrowser;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static util.Constants.ACTOR;

public class AmazonStepDefinition {

    @Before
    public void prepareStage() {
        PrepareActor.theAbilities();
    }

    @Given("^the user navigates to Amazon website$")
    public void theUserNavigatesTo() {
        theActorCalled(ACTOR).wasAbleTo(openTheBrowser());
    }

    @When("^Searches for (.*)$")
    public void searchesFor(String keyWord) {
        theActorInTheSpotlight().attemptsTo(Search.the(keyWord));
    }

    @When("^navigates to the second page$")
    public void navigatesToTheSecondPage() {
        theActorInTheSpotlight().attemptsTo(GoFor.secondPage());
    }

    @When("^selects the third item$")
    public void selectsTheThirdItem() {
        theActorInTheSpotlight().attemptsTo(Select.theThirdItem());
    }

    @Then("^assert that the item would be available for purchase$")
    public void assertThatTheItemWouldBeAvailableForPurchase() {
        theActorInTheSpotlight().should(seeThat(ItemIsAvailable.forPurchase()).orComplainWith(AvailabilityAssertion.class, ERROR_AVAILABILITY));
    }
}