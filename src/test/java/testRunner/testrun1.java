package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features=".//Features/snapdeal.feature",
        glue="stepDefinations",
        monochrome = true,
        dryRun=false,
        plugin= {"pretty","message:test-outpu"},
        tags= "@sanity"

)
public class testrun1 {
}
