package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static util.Constants.DEFAULT_WINDOW;

public class DefaultWindow implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return actor.recall(DEFAULT_WINDOW).equals(BrowseTheWeb.as(actor).getDriver().getWindowHandle());
    }

    public static DefaultWindow isActive() {
        return new DefaultWindow();
    }
}
