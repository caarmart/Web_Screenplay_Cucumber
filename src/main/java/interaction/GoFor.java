package interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.AmazonPage.SECOND_PAGE_BUTTON;

public class GoFor implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(SECOND_PAGE_BUTTON).andAlignToBottom(),
                Click.on(SECOND_PAGE_BUTTON));
    }

    public static GoFor secondPage() {
        return instrumented(GoFor.class);
    }
}