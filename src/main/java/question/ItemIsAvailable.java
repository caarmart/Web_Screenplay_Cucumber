package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.AmazonPage.*;
import static util.Constants.ITEM_NAME;

public class ItemIsAvailable implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        if (AVAILABILITY_BUTTON.resolveFor(actor).isVisible() || OUT_STOCK_MESSAGE.resolveFor(actor).isVisible()) {
            actor.attemptsTo(Click.on(AVAILABILITY_BUTTON),
                    Click.on(ADD_TO_CART_BUTTON),
                    Click.on(X_BUTTON));
        } else {
            actor.attemptsTo(Click.on(DIRECTLY_ADD_TO_CART_BUTTON));
        }
        actor.attemptsTo(Click.on(CART_BUTTON));
        String expectedItemName = actor.recall(ITEM_NAME).toString().substring(0, 20);
        String obtainedItemName = EXPECTED_ITEM_NAME.resolveFor(actor).getText().substring(0, 20);
        return expectedItemName.equals(obtainedItemName);
    }

    public static Question<Boolean> forPurchase() {
        return new ItemIsAvailable();
    }
}