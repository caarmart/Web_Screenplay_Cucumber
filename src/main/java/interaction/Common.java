package interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.AmazonPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Common implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(new AmazonPage()));
    }

    public static Common openTheBrowser() {
        return instrumented(Common.class);
    }
}