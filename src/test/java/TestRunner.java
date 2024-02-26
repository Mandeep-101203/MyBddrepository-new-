import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"}
            ,features ="src/test/java/Features"
        ,glue ={"BrowserControl","StepDefinations"}, tags = "@SmokeTest5")


public class TestRunner {
}

