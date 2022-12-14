package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exception.ResultNotWaiteAssertion;
import question.DefaultWindow;
import task.OpenTheCalculator;

import static exception.ResultNotWaiteAssertion.DEFAULT_WINDOW_ERROR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Pop_up {

    @When("^use the calculator$")
    public void useTheCalculator() {
        theActorInTheSpotlight().attemptsTo(OpenTheCalculator.perform());
    }

    @Then("^validate calculator has opened$")
    public void validateCalculatorHasOpened() {
        theActorInTheSpotlight().should(seeThat(DefaultWindow.isActive()).orComplainWith(ResultNotWaiteAssertion.class, DEFAULT_WINDOW_ERROR));
    }
}
