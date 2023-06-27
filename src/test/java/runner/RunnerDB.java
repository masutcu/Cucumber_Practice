package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = "",
        glue = {"stepDefinitions","hooks"},
        features = "./src/test/resources/",
        dryRun = false
)

public class RunnerDB {
}
