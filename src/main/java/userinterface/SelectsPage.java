package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://sahitest.com/demo/selectTest.htm")
public class SelectsPage extends PageObject {

    public static final Target SELECT1 = Target.the("Select1").located(By.id("s1Id"));
    public static final Target SELECT_AND_OPTION1 = Target.the("Select and option 1").located(By.xpath("//*[@value='o1' and @id='id1']"));
    public static final Target SELECT2 = Target.the("Select2").located(By.id("s2Id"));
    public static final Target SELECT3 = Target.the("Select3").located(By.id("s3Id"));
    public static final Target SELECT4 = Target.the("Select4").located(By.id("s4Id"));
    public static final Target SELECT5 = Target.the("Select5").located(By.id("s1"));
}
