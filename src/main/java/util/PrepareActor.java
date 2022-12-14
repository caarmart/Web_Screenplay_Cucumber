package util;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PrepareActor {

    public static void theAbilities() {
        OnStage.setTheStage(new OnlineCast());
    }
}
