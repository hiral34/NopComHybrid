package MSInnovations;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags="@test", plugin={"pretty","html:target/Destination"})
//@CucumberOptions(features = ".", plugin={"pretty","html:target/Destination"})

public class RunTest {
}
