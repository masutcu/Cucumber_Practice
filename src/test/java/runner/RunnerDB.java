package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = "@US01Api",
        glue = {"stepDefinitions","hooks"},
        features = "./src/test/resources/",
        dryRun = true
)

public class RunnerDB {
}
