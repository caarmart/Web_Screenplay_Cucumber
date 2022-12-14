package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://sahitest.com/demo/clicks.htm")
public class ClicksPage extends PageObject {

    public static final Target VALIDATION_TEXT = Target.the("Validation text").located(By.xpath("//*[@name='t2']"));
    public static final Target SIMPLE_CLICK_BUTTON = Target.the("Simple click button").located(By.xpath("//*[@value='click me']"));
    public static final Target DOUBLE_CLICK_BUTTON = Target.the("Double click button").located(By.xpath("//*[@value='dbl click me']"));
    public static final Target RIGHT_CLICK_BUTTON = Target.the("Right click button").located(By.xpath("//*[@value='right click me']"));
}
