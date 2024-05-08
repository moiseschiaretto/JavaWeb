package bdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/bdd",
		// plugin = {"pretty", "html:target/report-html"},
		monochrome = true,
		// snippets = SnippetType.CAMELCASE,
		dryRun = true,
		strict = false
		
		)

public class RunScenarios {

}
