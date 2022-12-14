package stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import util.PrepareActor;

import static interaction.Common.openTheBrowser;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static util.Constants.ACTOR;

public class Common {

    @Before
    public void prepareStage() {
        PrepareActor.theAbilities();
    }

    @Given("^go to the (.*) website$")
    public void goToTheWebsite(String topic) {
        theActorCalled(ACTOR).wasAbleTo(openTheBrowser(topic));
    }
}
