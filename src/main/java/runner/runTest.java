package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features ="src/main/java/feature/crmsfa.feature", glue="newsteps", monochrome=true)
public class runTest extends AbstractTestNGCucumberTests{

}
