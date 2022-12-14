package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://sahitest.com/demo/linkTest.htm")
public class LinksPage extends PageObject {

    public static final Target LINK_BY_CONTENT = Target.the("Link by content").located(By.linkText("linkByContent"));
    public static final Target LINK_BY_HTML = Target.the("Link by html").located(By.linkText("linkByHtml"));
    public static final Target LINK_BY_TITTLE = Target.the("Link by content tittle").located(By.cssSelector("body > h2"));
}
