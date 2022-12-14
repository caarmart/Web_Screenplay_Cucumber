package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.wextensible.com/temas/xhtml-css/script.html#ejemplo-window")
public class Pop_upPage extends PageObject {

    public static final Target CALCULATOR_BUTTON = Target.the("Calculator button").located(By.xpath("//*[@href='#calculadora' and text()='calculadora']"));
    public static final Target START_CALCULATOR_BUTTON = Target.the("Start calculator button").located(By.xpath("//*[text()='La calculadora se encuentra en la página ']//input"));
    public static final Target NUMBER1 = Target.the("Number 1").located(By.xpath("//*[@value='1']"));
    public static final Target NUMBER3 = Target.the("Number 3").located(By.xpath("//*[@value='3']"));
    public static final Target SUM_OPERATION = Target.the("Sum operation").located(By.xpath("//*[@value='+']"));
    public static final Target EQUAL_OPERATION = Target.the("Equal operation").located(By.xpath("//*[@value='=']"));
    public static final Target OPEN_CALCULATOR_BUTTON = Target.the("Open calculator button").located(By.xpath("//*[@value='Abrir calculadora']"));
}