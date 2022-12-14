package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import task.RightClick;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.hasValue;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterface.ClicksPage.*;
import static util.Constants.*;

public class Clicks {

    @When("^click an option$")
    public void clickAnOption() {
        theActorInTheSpotlight().attemptsTo(Click.on(SIMPLE_CLICK_BUTTON));
    }


    @Then("^validate the text after simple click$")
    public void validateTheTextAfterSimpleClick() {
        theActorInTheSpotlight().should(seeThat(the(VALIDATION_TEXT), hasValue(CLICK_TEXT)));
    }

    @When("^double click an option$")
    public void doubleClickAnOption() {
        theActorInTheSpotlight().attemptsTo(DoubleClick.on(DOUBLE_CLICK_BUTTON));
    }


    @Then("^validate the text after double click$")
    public void validateTheTextAfterDoubleClick() {
        theActorInTheSpotlight().should(seeThat(the(VALIDATION_TEXT), hasValue(DOUBLE_CLICK_TEXT)));
    }

    @When("^right click an option$")
    public void rightClickAnOption() {
        theActorInTheSpotlight().attemptsTo(RightClick.on(RIGHT_CLICK_BUTTON));
    }


    @Then("^validate the text after right click$")
    public void validateTheTextAfterRightClick() {
        theActorInTheSpotlight().should(seeThat(the(VALIDATION_TEXT), hasValue(RIGHT_CLICK_TEXT)));
    }
}
