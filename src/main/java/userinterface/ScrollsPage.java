package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://sahitest.com/demo/formTest.htm")
public class ScrollsPage extends PageObject {

    public static final Target PAGE_BOTTOM_TARGET = Target.the("Page bottom target ").located(By.xpath("//*[@value='Get All Attributes']"));
    public static final Target PAGE_MIDDLE_TARGET = Target.the("Page middle target ").located(By.xpath("//*[@multiple='multiple']"));
}
