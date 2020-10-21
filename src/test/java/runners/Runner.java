package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/features"},
		glue = {"steps", "setup"},
		snippets = SnippetType.CAMELCASE,
	    tags = {"@cadastroPositivo"},
		dryRun = false,
		strict = false
		
		)


public class Runner {

}
