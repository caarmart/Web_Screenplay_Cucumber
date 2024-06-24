package interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.AmazonPage.ITEM_NAME_TEXT;
import static userinterface.AmazonPage.THIRD_ITEM_BUTTON;
import static util.Constants.ITEM_NAME;

public class Select implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(THIRD_ITEM_BUTTON).andAlignToTop(),
                Click.on(THIRD_ITEM_BUTTON));
        actor.remember(ITEM_NAME, ITEM_NAME_TEXT.resolveFor(actor).getText());
    }

    public static Select theThirdItem() {
        return instrumented(Select.class);
    }
}