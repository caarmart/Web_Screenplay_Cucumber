package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/pop-upwindows.feature",
        glue = {"stepdefinition"},
        snippets = SnippetType.CAMELCASE
)
public class Pop_up {
}
