package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterface.LinksPage.*;

public class Links {

    @When("^go to linkByContent tittle$")
    public void goToLinkByContentTittle() {
        theActorInTheSpotlight().attemptsTo(Click.on(LINK_BY_CONTENT));
    }

    @When("^go to linkByHtml tittle$")
    public void goToLinkByHtmlTittle() {
        theActorInTheSpotlight().attemptsTo(Click.on(LINK_BY_HTML));
    }

    @Then("^validate the form$")
    public void validateTheForm() {
        theActorInTheSpotlight().should(seeThat(the(LINK_BY_TITTLE), WebElementStateMatchers.isVisible()));
    }
}
