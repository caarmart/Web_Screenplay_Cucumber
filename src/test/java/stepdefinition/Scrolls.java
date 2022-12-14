package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterface.ScrollsPage.PAGE_BOTTOM_TARGET;
import static userinterface.ScrollsPage.PAGE_MIDDLE_TARGET;

public class Scrolls {

    @When("^does the bottom scroll$")
    public void doesTheBottomScroll() {
        theActorInTheSpotlight().attemptsTo(Scroll.to(PAGE_BOTTOM_TARGET));
    }

    @Then("^validate page bottom$")
    public void validatePageBottom() {
        theActorInTheSpotlight().should(seeThat(the(PAGE_BOTTOM_TARGET), WebElementStateMatchers.isVisible()));
    }

    @When("^does the middle scroll$")
    public void doesTheMiddleScroll() {
        JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(theActorInTheSpotlight()).getDriver();
        js.executeScript("window.scrollBy(0,1200)");
    }

    @Then("^validate page middle$")
    public void validatePageMiddle() {
        theActorInTheSpotlight().should(seeThat(the(PAGE_MIDDLE_TARGET), WebElementStateMatchers.isVisible()));
    }
}
