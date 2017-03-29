package stepDefinition;

/**
 * Created by root on 3/29/17.
 */
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/java/Feature"
        ,glue={"./src/test/java/stepDefinition"}
)

public class TestRunner {

}