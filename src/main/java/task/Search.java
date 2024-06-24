package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.AmazonPage.SEARCH_BUTTON;
import static userinterface.AmazonPage.SEARCH_INPUT;

public class Search implements Task {

    private final String keyWord;

    public Search(String keyWord) {
        this.keyWord = keyWord;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SendKeys.of(keyWord).into(SEARCH_INPUT),
                Click.on(SEARCH_BUTTON));
    }

    public static Search the(String keyWord) {
        return instrumented(Search.class, keyWord);
    }
}