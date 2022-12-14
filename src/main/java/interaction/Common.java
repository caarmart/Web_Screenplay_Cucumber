package interaction;

import exception.OptionNotFoundException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.*;

import static exception.OptionNotFoundException.OPTION_NOT_FOUND;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static util.Constants.*;

public class Common implements Interaction {

    private final String topic;

    public Common(String topic) {
        this.topic = topic;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (topic) {
            case LINK -> actor.wasAbleTo(Open.browserOn(new LinksPage()));
            case SELECTS -> actor.wasAbleTo(Open.browserOn(new SelectsPage()));
            case CLICKS -> actor.wasAbleTo(Open.browserOn(new ClicksPage()));
            case POP_UP_WINDOWS -> actor.wasAbleTo(Open.browserOn(new Pop_upPage()));
            case SCROLLS -> actor.wasAbleTo(Open.browserOn(new ScrollsPage()));
            default -> throw new OptionNotFoundException(OPTION_NOT_FOUND);
        }
    }

    public static Common openTheBrowser(String topic) {
        return instrumented(Common.class, topic);
    }
}
