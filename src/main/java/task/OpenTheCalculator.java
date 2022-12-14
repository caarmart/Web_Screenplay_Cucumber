package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.Pop_upPage.*;
import static util.Constants.DEFAULT_WINDOW;

public class OpenTheCalculator implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CALCULATOR_BUTTON),
                Click.on(START_CALCULATOR_BUTTON));
        actor.remember(DEFAULT_WINDOW, BrowseTheWeb.as(actor).getDriver().getWindowHandle());
        getNewWindowHandle(actor);
        actor.attemptsTo(Click.on(NUMBER1),
                Click.on(SUM_OPERATION),
                Click.on(NUMBER3),
                Click.on(EQUAL_OPERATION));
        BrowseTheWeb.as(actor).getDriver().close();
        actor.attemptsTo(Switch.toWindow(actor.recall(DEFAULT_WINDOW)),
                Click.on(OPEN_CALCULATOR_BUTTON));
    }

    public static OpenTheCalculator perform() {
        return instrumented(OpenTheCalculator.class);
    }

    private static void getNewWindowHandle(Actor actor) {
        for (String winHandle : BrowseTheWeb.as(actor).getDriver().getWindowHandles()) {
            BrowseTheWeb.as(actor).getDriver().switchTo().window(winHandle);
        }
    }
}