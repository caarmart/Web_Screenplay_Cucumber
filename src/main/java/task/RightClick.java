package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RightClick implements Task {

    private final Target target;

    public RightClick(Target target) {
        this.target = target;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());
        actions.contextClick(target.resolveFor(actor)).perform();
    }

    public static RightClick on(Target target) {
        return instrumented(RightClick.class, target);
    }
}