package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.hasValue;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterface.SelectsPage.*;
import static util.Constants.*;

public class Selects {

    @When("^select the first option$")
    public void selectTheFirstOption() {
        theActorInTheSpotlight().attemptsTo(Click.on(SELECT_AND_OPTION1));
    }

    @Then("^validate select first text$")
    public void validateSelectFirstText() {
        theActorInTheSpotlight().should(seeThat(the(SELECT1), hasValue(OPTION1)));
    }

    @When("^select the second option$")
    public void selectTheSecondOption() {
        theActorInTheSpotlight().attemptsTo(SelectFromOptions.byVisibleText(OPTION2).from(SELECT2));
    }

    @Then("^validate select second text$")
    public void validateSelectSecondText() {
        theActorInTheSpotlight().should(seeThat(the(SELECT2), hasValue(OPTION2)));
    }

    @When("^select the third option$")
    public void selectTheThirdOption() {
        theActorInTheSpotlight().attemptsTo(SelectFromOptions.byIndex(3).from(SELECT3));
    }

    @Then("^validate select third text$")
    public void validateSelectThirdText() {
        theActorInTheSpotlight().should(seeThat(the(SELECT3), hasValue(OPTION3)));
    }

    @When("^select the third option by value$")
    public void selectTheThirdOptionByValue() {
        theActorInTheSpotlight().attemptsTo(SelectFromOptions.byValue(SELECT_VALUE3).from(SELECT4));
    }

    @Then("^validate select fourth text$")
    public void validateSelectFourthText() {
        theActorInTheSpotlight().should(seeThat(the(SELECT4), hasValue(OPTION3)));
    }

    @When("^select the fifth option$")
    public void selectTheFifthOption() {
        SELECT5.resolveFor(theActorInTheSpotlight()).sendKeys(OPTION4);
    }


    @Then("^validate select fifth text$")
    public void validateSelectFifthText() {
        theActorInTheSpotlight().should(seeThat(the(SELECT5), containsText(OPTION4)));
    }
}
